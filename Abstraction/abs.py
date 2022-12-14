from abc import ABC
class A(ABC):
  def disp(self):
      pass
class B(A):
  a=None
  b=None
  def __init__(self,x,y):
      self.a=x
      self.b=y
  def disp(self):
    print("Value of a is",self.a)
obj = B(7,10)
obj.disp()
      