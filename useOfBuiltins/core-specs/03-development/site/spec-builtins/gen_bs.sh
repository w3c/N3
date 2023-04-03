#!/bin/bash
if command -v python &>/dev/null; then
    python create-markdown.py > index.bs
else
    python3 create-markdown.py > index.bs
fi
