.PHONY: comp run clean run-python

comp:
	javac project/*.java

clean:
	rm project/*.class

run: clean comp
	java project.Main
