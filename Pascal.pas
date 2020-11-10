var
A,B : int64;
begin
    read(A);
    read(B);
if(A = 1)then
    writeln('Total: R$ ', 4.00 * B:-1:2 )
else if(A = 2)then
    writeln('Total: R$ ', 4.50 * B:-1:2 )
else if(A = 3)then
    writeln('Total: R$ ', 5.00 * B:-1:2 )
else if(A = 4)then
    writeln('Total: R$ ', 2.00 * B:-1:2 )
else if(A = 5)then
    writeln('Total: R$ ', 1.50 * B:-1:2 )
end.
