fun main() {
    var buyer = true // ежемесячный покупатель или нет, тру или фолс
    val buy = 10450 // покупка
    val discount1 = 100// 100 р скидка первая скидка
    val discount2 = 5// скидка в процентах вторая скидка
    val dopDiskont = 1// доп процент постоянному покупателю
    val discountcnt1 = 1000// первый порог скидки
    val discountcnt2 = 10000// второй порог скидки
    var buyerCount = 0 // скидка клиента ежемесячный или обычный
    var total = 0

    if (buy <= discountcnt1)
        total = buy
    if (buy > discountcnt1 && buy < discountcnt2)
        total = buy - discount1
    if (buy > discountcnt2)
        total = buy - buy * discount2 / 100
    if (buyer == true)
        buyerCount = total - total * dopDiskont / 100
    else buyerCount = total
    println("Цена с учетом скидки " + buyerCount)

}