
# Lab 5 - Spring AOP

You can continue to your last lab assignment to implement followings.

###  Requirements
--- 
* Make a `ActivityLog` database table (`id,date,operation,duration`) that will store all methods that have `ExecutionTime` annotations.
* Make an `Aspect` that has an annotation pointcut `@ExecutionTime`, when placed on a method, it calculates the time taken to complete that method and writes it to `ActivityLog` table.
* Make an `Aspect` that has an pointcut for classes in `edu.miu.service` package to check if `POST` requests has `AOP-IS-AWESOME` header. If the header is not present then throw a `AopIsAwesomeHeaderException`.

### Technical Details
---
* Use n-tier software architecture model.
* Use DTOs.
* PostgreSQL is recommended as a Relational Database system.
* Populate your database with dummy data using `data.sql`.


## Submission

* Fork the repository and push your changes.
* Once you finished your project, send a Pull Request. (Send only one Pull Request once you finish the assignment.)

### Important Notes
---

 * You are not allowed to share codes with your classmates. If detected, you will get NC.
 * **For pairs:**
	 * Individual's work will be checked from the commits.
	 *  Share tasks evenly and fairly.
	 *  To have a clearer understanding of pair programming:
		 *  > **Pair programming** is an agile software development technique in which two programmers work together at one workstation. One, the _driver_, writes code while the other, the _observer_ or _navigator_ reviews each line of code as it is typed in. The two programmers switch roles frequently. 
		 * [Wikipedia](https://en.wikipedia.org/wiki/Pair_programming#:~:text=Pair%20programming%20is%20an%20agile,two%20programmers%20switch%20roles%20frequently.)

-   Remember to respect the code honor submission policy. All written code must be original. Presenting something as one’s own work when it came from another source is plagiarism and is forbidden.
    
-   Plagiarism is a very serious thing in all American academic institutions and is guarded against vigilantly by every professor.

