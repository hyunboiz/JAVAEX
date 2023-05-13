package JavaBuilder;

public interface Builder {
    Builder setTraDa(int traDa);
    Builder setBanhMi(int banhMi);
    Builder setPho(int pho);
    Builder setBun(int bun);
    Builder setCoca(int coca);
    Builder setCafe(int cafe);
    Builder setXoi(int xoi);
    Builder setKem(int kem);
    Builder setTraSua(int traSua);
    Builder setChao(int chao);

    Order create();
}
