vitima(anita).

pobre(bernardo).
pobre(bia).
pobre(pedro).
pobre(maria).

relacionamento(anita,bernardo).
relacionamento(bernardo,caren).
relacionamento(anita,pedro).
relacionamento(pedro,alice).
relacionamento(alice,henrique).
relacionamento(henrique,maria).
relacionamento(adriano,maria).
relacionamento(adriano,caren).

insano(adriano).
insano(maria).


santamaria(pedro,segunda).
santamaria(pedro,terca).
santamaria(pedro,quinta).
santamaria(caren,quinta).
santamaria(bia,quinta).
santamaria(adriano,quarta).
santamaria(bernardo,segunda).
santamaria(bernardo,terca).
santamaria(bernardo,quinta).
santamaria(maria,terca).
santamaria(maria,quarta).
santamaria(maria,quinta).
portoalegre(pedro,quarta).
portoalegre(caren,segunda).
portoalegre(caren,terca).
portoalegre(caren,quarta).
portoalegre(henrique,terca).
portoalegre(bia,terca).
portoalegre(bia,quarta).
portoalegre(alice,terca).
portoalegre(alice,quarta).
portoalegre(bernardo,quarta).
apartamento(pedro,sexta).
apartamento(caren,sexta).
apartamento(henrique,segunda).
apartamento(henrique,quarta).
apartamento(henrique,quinta).
apartamento(henrique,sexta).
apartamento(bia,segunda).
apartamento(bia,sexta).
apartamento(adriano,segunda).
apartamento(adriano,terca).
apartamento(adriano,quinta).
apartamento(adriano,sexta).
apartamento(alice,segunda).
apartamento(alice,quinta).
apartamento(alice,sexta).
apartamento(bernardo,sexta).
apartamento(maria,segunda).
apartamento(maria,sexta).


namorou(X,Y) :- relacionamento(X,Y) ; relacionamento(Y,X).
ciumes(X,Y) :- namorou(Z,X) , namorou(Y,Z), not(X=Y).

localcrime(X) :- apartamento(X,quinta) ; apartamento(X,sexta).
poderoubararma(X) :- portoalegre(X,quinta) ; santamaria(X,quarta) ; apartamento(X,quarta) ; apartamento(X,quinta).
poderoubarchave(X) :- santamaria(X,segunda) ; portoalegre(X,terca).

motivo(X) :- ciumes(X,anita) ; insano(X) ; pobre(X).

acesso(X) :- poderoubararma(X), poderoubarchave(X) , localcrime(X).
assassino(X) :- motivo(X) , acesso(X).
