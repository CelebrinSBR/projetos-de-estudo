public abstract class criatura {
    String nome;
    int vida;
    int nivel;
}
public Criatura(String nome, int nivel, int vida){
    this.nome = nome;
    this.vida = vida;
    this.nivel = nivel;
}
public abstract void atacar(criatura alvo);

public void receberDano(int dano){
    this.vida-= dano;
    if (this.vida<=0){
        this.vida=0
    }
}


