package ru.kborodulin.task13;

import java.io.IOException;
import java.util.Formatter;

/**
 * Форматирование страницы
 */
public class PageFormat {
    private Formatter fmt = new Formatter();
    private IOStream ioStream = new IOStream();
    private ProductList productList = new ProductList();

    /**
     * Шапка страницы
     */
    public Formatter headerPage() {
        fmt.format("[%-20s][%10s][%3s][%10s][%10s]%n", "Наименование", "Цена", " ", "Кол-во", "Стоимость");
        fmt.format("===============================================================%n");
        return fmt;
    }

    /**
     * Тело страницы
     */
    public Formatter formatPage(String nameProduct, double priceProduct, double countProduct) {
        fmt.format("[%-20s][%10.2f][%s][%10.3f][%10s]%n",
                nameProduct,
                priceProduct,
                " x ",
                countProduct,
                String.format("=%.2f", priceProduct * countProduct));
        return fmt;
    }

    /**
     * Подвал страницы
     */
    public Formatter footerPage() {
        fmt.format("===============================================================%n");
        fmt.format("Итого:                                             [%10.2f]", productList.totalSumProducts());
        return fmt;
    }

    /**
     * Отформатированная страница
     */
    public Formatter formattedPage() throws IOException {
        ioStream.readFile(productList);
        fmt = headerPage();
        for (Product product : productList.getListProducts()) {
            fmt = formatPage(product.getNameProduct(), product.getPriceProduct(), product.getCountProduct());
        }
        fmt = footerPage();
        return fmt;
    }
}