#!/bin/bash

cd /srv/jekyll
bundle install
bundle exec jekyll build
bundle exec jekyll server