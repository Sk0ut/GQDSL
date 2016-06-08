**PROJECT TITLE: GQDSL
**GROUP: 3MIEIC01
NAME1: Afonso Castro, NR1: up201304205, GRADE1: <18 to 20 value>, CONTRIBUTION: <20 to 100 %>
NAME2: Ângela Cardoso, NR2: up200204375, GRADE2: <18 to 20 value>, CONTRIBUTION: <20 to 100 %>
NAME3: Flávio Couto, NR3: up201303726, GRADE3: <18 to 20 value>, CONTRIBUTION: <20 to 100 %>
NAME4: Nuno Valente, NR4: up200204376, GRADE4: <18 to 20 value>, CONTRIBUTION: <20 to 100 %>
NAME5: Pedro Castro, NR5: up201305337, GRADE5: <18 to 20 value>, CONTRIBUTION: <20 to 100 %>


**SUMMARY: Our DSL is a graph query language based in sparql (a graph query language somewhat similar to SQL). Given a java file with graph queries writen in our DSL, our tool writes the necessary code to load the graph, execute the query and list the results.


**DEALING WITH SYNTACTIC ERRORS: Upon a syntactic error, our tool exits, with javacc pointing to the error location.


**SEMANTIC ANALYSIS: For each query, our tool verifies that in the end all variables are defined and used in the correct manner. At the beggining of query semantic analysis, there are four types of variables: undefined, vertex, value and property. In the end there can only be three types of variables: vertex, value and property. The following expressions are the only valid relations in our DSL:
- vertex v:______ CONST
- vertex v:______ value
- vertex e:______ vertex
- vertex p:______ property
- property v:______ CONST
- property v:______ value


**INTERMEDIATE REPRESENTATIONS (IRs): our IRs have the following format:
- START
	- JAVACODE
	- QUERY
		- GRAPH
		- RETURN
		- EXPRESSION
			- SELECT
			- WHERE
				- RELATION
					- SUBJECT
					- TYPE
					- VALUE
				- ...		
	- JAVACODE
	- ...


**CODE GENERATION: Our tool generates code by inserting the relevant entries of the query in a java template that requires the Apache Jena libraries to execute the query.


**OVERVIEW: Our approach is very straightforward, we start with the lexical and syntactical verification, generate the AST and validate the semantics of our DSL. Then we generate the final code using a java template. We use javacc to parse the provided file into an AST. We also use Apache Jena libraries to allow the end user to execute the generated queries with the compiled file. Finally, our DSL is inspired in SPARQL.


**TESTSUITE AND TEST INFRASTRUCTURE: We do not have automated tests, but we have created some examples whose syntactical and semantical correctness is verified by the tool.


**TASK DISTRIBUTION:
- project specification;
- DSL lexical analysis;
- DSL syntactical analysis;
- DSL semantical analysis;
- AST construction;
- code generation;
- testing;
- tool interaction;
- technical investigation (SPARQL, Gremlin, Apache Jena, RDF, javacc).

Every element of the group contributed to most of the task listed above,
with some exceptions not necessary to discriminate.


**PROS:
Our tool allows users to write quick graph queries.
These queries can be inserted into any java code file for processing.

**CONS:
Our DSL only recognizes a subset of the SPARQL DSL.
We were not able to test the property function of our DSL, because we could not generate an appropriate graph.
The application lacks automated testing.