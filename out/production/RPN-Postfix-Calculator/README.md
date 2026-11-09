# RPN-Postfix-Calculator
The calculator evaluates an expression in postfix  and give its output
Algorithm:
	--> Create a stack to store oprerands(Values)
  
	--> Scan the given expression and do the following for every scanned element:
  
		->If the element is a number, push it to the stack
    
		->If the element is an operator, pop two operands from the stack evalaute the two popped elements with the current operator and push the result back to the stack.
      
	--> When the expression is ended, the top element in the stack is the answer (pop())
