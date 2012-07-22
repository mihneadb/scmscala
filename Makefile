run:
	scala -cp objdir/ scm

build:
	scalac src/scm.scala -d objdir/ -unchecked

clean:
	rm -rf objdir/*
