# Setup auto formatting of codes

Inside `git bash` or your linux shell, run 
```
bash setup-hooks.sh
```

This has to be done only **once**. Usually, at the time of cloning the
project.

On every subsequent commit, your files will get formatted according to the
google java formatting guide.

So, the next time you add a java file, and run a git commit, the output will
look like:

```
$ git commit -m "updated AddOneToNumber solution to not use any arrays"
Running auto-formatter for any changed Java files
(formatting changes will be automatically added to your commit)
	Formatting: Abhi.java
Finished formatting.
[master 0ec8faf] fix: formatting of Java source files
 30 files changed, 1076 insertions(+), 1106 deletions(-)
 rewrite InterviewBit/Arrays/AddOneToNumber/Abhi.java (81%)
```
