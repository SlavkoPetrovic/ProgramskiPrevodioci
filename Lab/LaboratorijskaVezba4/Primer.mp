program
begin
int:integer;
double:real;

int:=4;
double:=int;
	select begin 
		case (double==int) => int:=6;
	end
	
	begin
	int:integer;
	int:=5;
	end
end.