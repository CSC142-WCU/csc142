#!/bin/bash

docker run -v ${pwd}:/srv/jekyll -p 4000:4000 -it jekyll/jekyll /bin/bash -c "bundle install; bundle exec jekyll serve --host 0.0.0.0" --verbose