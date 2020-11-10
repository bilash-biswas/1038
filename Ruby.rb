a,b = gets().chomp().split(' ');
a = a.to_i
b = b.to_i
case a
when 1
  c = 4.00 * b
  printf("Total: R$ %.2f\n", c);
when 2
  c = 4.50 * b
  printf("Total: R$ %.2f\n", c);
when 3
  c = 5.00 * b
  printf("Total: R$ %.2f\n", c);
when 4
  c = 2.00 * b
  printf("Total: R$ %.2f\n", c);
when 5
  c = 1.50 * b
  printf("Total: R$ %.2f\n", c);
end
