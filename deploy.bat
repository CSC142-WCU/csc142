set args1=%1
echo %args1%
echo %cd%%
del -Force -Recurse -Y _site
bundle exec jekyll build

echo "DONE BUILD"

scp -r "_site\*" %args1%:~/public_html