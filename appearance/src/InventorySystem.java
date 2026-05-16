class InventorySystem {
    public boolean checkStock(String fruitType, int count) {
        System.out.println("【库存系统】检查" + fruitType + "库存，剩余：" + (100 + count) + "斤，库存充足");
        return true;
    }

    public void deductStock(String fruitType, int count) {
        System.out.println("【库存系统】扣除" + fruitType + "库存：" + count + "斤");
    }
}