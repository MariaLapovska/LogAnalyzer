# LogAnalyzer

Нужно определить (вывести в консоль) CustomerId всех пользователей, которые в течении 5 секунд пытаются проиграть (возможно нажимая на стоп) 3 и больше раза плейбек в проигрывателе (представь, что это Netflix хочет определить пользователей, у которых проблемы с проигрыванием).

Собирается файл за 1 час, но анализировать нужно все файлы, переданные в аргументах к анализатору.

Расширение логов: _\*.log_

Формат логов:  
```
2017-07-04 10:57:51.112  INFO 45469 --- [main] org.myproject.Application  : CustomerId: 123456789 PlaybackAction: Start    
2017-07-04 10:57:52.134  INFO 45469 --- [main] org.myproject.Application  : CustomerId: 123456789 PlaybackAction: Stop
2017-07-04 10:57:52.955  INFO 45469 --- [main] org.myproject.Application  : CustomerId: 123456789 PlaybackAction: Start
```
