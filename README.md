# Задача «Логгер»

## Описание
В этом задании попрактикуемся с шаблоном *Singleton* (*Одиночка*). Мы пишем программу, которая будет каждый свой шаг обильно логгировать в консоль, но не напрямую через `System.out.println`, а через объект-логгер нашего собственного класса-синглтона.

### Функционал программы
1. Программа здоровается с пользователем, просит ввести два числа: размер списка `N` и верхнюю границу значений элементов в списке `M`.
2. Программа создаёт список `ArrayList` из `N` элементов и заполняет их случайными числами от `0` до `M`.
3. Программа просит пользователя ввести число `f` для фильтрации списка.
4. Программа создаёт объект `filter` вашего класса `Filter`, передав в конструктор значение `f`
5. Программа вызывает у `filter` метод `List<Integer> filterOut(List<Integer> list)`, передавая созданный случайный список в качестве параметра и принимая в качестве ответа список, который идентичен исходному, если пропустить элементы меньше `f`
6. Программа выводит итоговый список на экран и завершает свою работу

### Логгер
Каждое действие программы, будь то некорректный ввод пользователем входных данных или решение не добавлять элемент в результирующий список в методе `filterOut`, должно быть залоггировано. Для этого надо создать синглтон-класс `Logger` у которого будет метод `void log(String msg)` для вывода на экран сообщения. Сообщение должно выводиться в формате: `[<дата и номер сообщения>] <текст сообщения>`, где `<номер сообщения>` это порядковый номер выводимого логгером сообщения, а `<текст сообщения>` это значение параметра `msg`.

## Пример запуска
*Жирным шрифтом в примере это ввод пользователем данных*
> [31.12.2019 15:38:22 1] Запускаем программу  <br/>
> [31.12.2019 15:38:22 2] Просим пользователя ввести входные данные для списка <br/>
> Введите размер списка: **7**<br/>
> Введите верхнюю границу для значений: **10** <br/>
> [31.12.2019 15:38:23 3] Создаём и наполняем список <br/>
> Вот случайный список: 3 5 5 1 0 3 6 <br/>
> [31.12.2019 15:38:23 4] Просим пользователя ввести входные данные для фильтрации <br/>
> Введите порог для фильтра: **4** <br/>
> [31.12.2019 15:38:23 5] Запускаем фильтрацию <br/>
> [31.12.2019 15:38:23 6] Элемент "3" не проходит <br/>
> [31.12.2019 15:38:23 7] Элемент "5" проходит <br/>
> [31.12.2019 15:38:23 8] Элемент "5" проходит <br/>
> [31.12.2019 15:38:23 9] Элемент "1" не проходит <br/>
> [31.12.2019 15:38:23 10] Элемент "0" не проходит <br/>
> [31.12.2019 15:38:24 11] Элемент "3" не проходит <br/>
> [31.12.2019 15:38:24 12] Элемент "6" проходит <br/>
> [31.12.2019 15:38:24 13] Прошло фильтр 3 элемента из 7 <br/>
> [31.12.2019 15:38:24 14] Выводим результат на экран <br/>
> Отфильтрованный список: 5 5 6 <br/>
> [31.12.2019 15:38:24 15] Завершаем программу <br/>
