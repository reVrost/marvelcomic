##marvelcomic

To run the server, you must first build the solution using gradle `gradle build`.
This will generate a build/ directory.
then to run it go to /build/libs and execute `java -jar marvelcomic-0.1.0.jar`

the server will be hosted on port 8080 by default.
And the endpoint to query the comicIds is on `http://localhost:8080/comics`

for example, to get comic with id of 1024 and 1025 the endpoint should be written like so `http://localhost:8080/comics?comicIds=1024,1025`

Notes:
Doing this project took me longer than I expected,
I am used to writing in .NET so going from that to Java took a bit if time to get used to, especially with the whole build process with gradle. 

There are a couple of things that I would like to improve if I had more time;
One of them is to query the Marvel API asynchronously instead of synchronously to improve speed.
Other things that could be improved are error handling and sanitizing inputs/params.
