Public int FindLast(int x[], int y)
{
  for(int i = x.length -1)
  {
     if (x[i] == y)
      {
        return i;
      }
  }
return -1;
}

int main()
{
  int a = [2,3,5], b = 2;
  int c = FindLast(a,b);
  printf(c);
}
