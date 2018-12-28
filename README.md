# SpringBoot-Angular6

Uncomment package.json and package-lock.json

1. install Node.js for aungular: node -v & npm -v
 A common task for a web server can be to open a file on the server and return the content to the client.
 Node.js eliminates the waiting, and simply continues with the next request.
 Node.js runs single-threaded, non-blocking, asynchronously programming, which is very memory efficient.

2. Install  Angular-CLI
   npm install -g @angular/cli
	****************
	ng new
	The Angular CLI makes it easy to create an application that already works, right out of the box. It already follows our best practices!

	ng generate
	Generate components, routes, services and pipes with a simple command. The CLI will also create simple test shells for all of these.

	ng serve
	Easily test your app locally while developing.

	Test, Lint, Format
	Make your code really shine. Run your unittests or your end-to-end tests with the breeze of a command. Execute the official Angular linter and run clang format.

--------> check: ng -v

3. SetUp SpringBoot Web Project
	
4. Create Angular4 Client Project
	cd location: ng new angular4-client /*Project 'angular4-client' successfully created.*/ in Intellij it detects and configure automatically.
	cd  angular4-client : npm start *****-> it invoke ng serve <compiled successfully>

5. Import Angular4 client project to Spring ToolmSuite
	 
6. run springboot and ng serve --> before setup componts and url
	
   POST http://localhost:8080/students {"id":2,"name":"Mani","course":"ENTC"}
