A = io.read("*n")
B = io.read("*n")
if A == 1 then
    print("Total: R$ "..string.format( "%.2f", 4.00 * B ))
elseif A == 2 then
    print("Total: R$ "..string.format( "%.2f", 4.50 * B ))
elseif A == 3 then
    print("Total: R$ "..string.format( "%.2f", 5.00 * B ))
elseif A == 4 then
    print("Total: R$ "..string.format( "%.2f", 2.00 * B ))
elseif A == 5 then
    print("Total: R$ "..string.format( "%.2f", 1.50 * B ))
end
