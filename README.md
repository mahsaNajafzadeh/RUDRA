RUDRA

RUDRA is an SMT-based tool that  automatically and transparently injects concurrency control into a Ruby on Rails  application, to ensure they execute correctly in geo-distributed environments with replicated data store. 
A successful analysis proves that a given program will maintain its integrity invariants. If not, the tool provides a counter-example, which the program developer can examine, in order to adjust the program design either by weakening application semantics, and/or by adding concurrency controls, in order to disallow toxic concurrency.    


Requirements: 
 1) Z3 SAT solver library
 2) Antrl4 Runtime
 
 The tool takes a ruby data model as input and checks whether the concurrenct exceution of every two actions mainatins the correctness properties implied by the data model, if so it returns true, otherwise it returns a counter-example. 
 
 
 

