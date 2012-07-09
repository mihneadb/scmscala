run:
	scala -cp objdir/ scm

build:
	scalac src/scm.scala -d objdir/

clean:
	rm -rf objdir/*
