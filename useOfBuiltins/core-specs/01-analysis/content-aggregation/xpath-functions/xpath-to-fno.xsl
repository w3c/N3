 <xsl:stylesheet version="3.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"    xmlns:fos="http://www.w3.org/xpath-functions/spec/namespace">
    <xsl:output method="text" omit-xml-declaration="yes" indent="no"/>

    <xsl:template match="/">
    @prefix dc: &lt;http://purl.org/dc/terms/&gt; .
    @prefix fno: &lt;https://w3id.org/function/ontology#&gt; .
    @prefix owl: &lt;http://www.w3.org/2002/07/owl#&gt; .
    @prefix rdf: &lt;http://www.w3.org/1999/02/22-rdf-syntax-ns#&gt; .
    @prefix rdfs: &lt;http://www.w3.org/2000/01/rdf-schema#&gt;.
    @prefix skos: &lt;http://www.w3.org/2004/02/skos/core#&gt; .
    @prefix uml: &lt;http://schema.omg.org/spec/UML/2.1#&gt; .
    @prefix xpath-fn: &lt;http://www.w3.org/2005/xpath-functions#&gt; .
    @prefix xpath-math: &lt;http://www.w3.org/2005/xpath-functions/math#&gt; .
    @prefix xpath-map: &lt;http://www.w3.org/2005/xpath-functions/map#&gt; .
    @prefix xpath-array: &lt;http://www.w3.org/2005/xpath-functions/array#&gt; .
    @prefix xpath-op: &lt;http://www.w3.org/2005/xpath-functions/op#&gt; .    
    @prefix xsd: &lt;http://www.w3.org/2001/XMLSchema#&gt; .

    <xsl:for-each select="//fos:function[@name and @prefix]">
    xpath-<xsl:value-of select="@prefix"/>:<xsl:value-of select="@name"/> a fno:Function ;
        fno:name "<xsl:value-of select="@name"/>" ;
        dc:description "<xsl:value-of select="normalize-space(replace(fos:summary/p, '(&quot;|'')', '\\$1'))"/>" ;
        fno:expects (<xsl:for-each select="fos:signatures/fos:proto/fos:arg">
            [ a fno:Parameter ;
                fno:predicate "<xsl:value-of select="@name"/>" ;
                fno:type "<xsl:value-of select="@type"/>" ;
                fno:required "true"^^xsd:boolean  ]</xsl:for-each> 
        ) ;
        fno:returns ( "<xsl:value-of select="distinct-values(fos:signatures/fos:proto/@return-type)"/>" ) ;
        fno:example (<xsl:for-each select="fos:examples/fos:example/fos:test">
            [ a fno:Test ;
                fno:expression "<xsl:value-of select="normalize-space(replace(replace(fos:expression,'\\','\\\\'), '(&quot;|'')', '\\$1'))"/>" ;
                fno:result "<xsl:value-of select="replace(replace(normalize-space(replace(fos:result, '(&quot;|'')', '\\$1')),'&lt;',''),'&gt;','')"/>" ]</xsl:for-each> ) ;
        .
    </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>    