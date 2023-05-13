package JavaBuilder;

public class Order {
    static class Builder{
        private int traDa;
        private int banhMi;
        private int pho;
        private int bun;
        private int coca;
        private int cafe;
        private int xoi;
        private int kem;
        private int traSua;
        private int chao;

        public Builder(){}

        public Builder setTraDa(int traDa){
            this.traDa = traDa;
            return this;
        }
        public Builder setBanhMi(int banhMi){
            this.banhMi = banhMi;
            return this;
        }
        public Builder setPho(int pho){
            this.pho = pho;
            return this;
        }
        public Builder setBun(int bun){
            this.bun = bun;
            return this;
        }
        public Builder setCoca(int coca){
            this.coca = coca;
            return this;
        }
        public Builder setCafe(int cafe){
            this.cafe = cafe;
            return this;
        }
        public Builder setXoi(int xoi){
            this.xoi = xoi;
            return this;
        }
        public Builder setKem(int kem){
            this.kem = kem;
            return this;
        }
        public Builder setTraSua(int traSua){
            this.traSua = traSua;
            return this;
        }
        public Builder setChao(int chao){
            this.chao = chao;
            return this;
        }
        public Order create(){
            return new Order(traDa, banhMi, pho, bun, coca, cafe, xoi, kem, traSua, chao);
        }


    }
    private int traDa;
    private int banhMi;
    private int pho;
    private int bun;
    private int coca;
    private int cafe;
    private int xoi;
    private int kem;
    private int traSua;
    private int chao;

    private Order(int traDa, int banhMi, int pho, int bun, int coca, int cafe, int xoi, int kem, int traSua, int chao) {
        this.traDa = traDa;
        this.banhMi = banhMi;
        this.pho = pho;
        this.bun = bun;
        this.coca = coca;
        this.cafe = cafe;
        this.xoi = xoi;
        this.kem = kem;
        this.traSua = traSua;
        this.chao = chao;
    }

    public int getTraDa() {
        return traDa;
    }

    public void setTraDa(int traDa) {
        this.traDa = traDa;
    }

    public int getBanhMi() {
        return banhMi;
    }

    public void setBanhMi(int banhMi) {
        this.banhMi = banhMi;
    }

    public int getPho() {
        return pho;
    }

    public void setPho(int pho) {
        this.pho = pho;
    }

    public int getBun() {
        return bun;
    }

    public void setBun(int bun) {
        this.bun = bun;
    }

    public int getCoca() {
        return coca;
    }

    public void setCoca(int coca) {
        this.coca = coca;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getXoi() {
        return xoi;
    }

    public void setXoi(int xoi) {
        this.xoi = xoi;
    }

    public int getKem() {
        return kem;
    }

    public void setKem(int kem) {
        this.kem = kem;
    }

    public int getTraSua() {
        return traSua;
    }

    public void setTraSua(int traSua) {
        this.traSua = traSua;
    }

    public int getChao() {
        return chao;
    }

    public void setChao(int chao) {
        this.chao = chao;
    }

    @Override
    public String toString() {
        return "Order{" +
                "traDa=" + traDa +
                ", banhMi=" + banhMi +
                ", pho=" + pho +
                ", bun=" + bun +
                ", coca=" + coca +
                ", cafe=" + cafe +
                ", xoi=" + xoi +
                ", kem=" + kem +
                ", traSua=" + traSua +
                ", chao=" + chao +
                '}';
    }
}
