# SI_2023_lab2_213026,Matea Blazeska
Фотографија од Control Flow Graph

![control](https://github.com/Matea111777/SI_2023_lab2_213026/assets/108890575/e3b885b5-c55d-4a50-98e0-70221acb061d)

Цикломатска комплексност

Цикломатската комплексност е пресметана преку формулата=број на предикатни јазли + 1.Во задачата имаме 10 предикатни јазли и плус 1 тоа ни дава дека комплексноста е 11.

Тест случаи според критериумот Every Branch

[EveryBranch.xlsx](https://github.com/Matea111777/SI_2023_lab2_213026/files/11594516/EveryBranch.xlsx)

Тест случаи според критериумот Multiple Condition за условот if (user==null || user.getPassword()==null || user.getEmail()==null)

![350357498_654595803187158_8607862438385237492_n](https://github.com/Matea111777/SI_2023_lab2_213026/assets/108890575/1bbd5c3d-cb91-4f86-bcb8-24f4c07521e6)

Објаснување за тест случаите

Every branch

-Прв тест:user е null.Задачата фрла execption.

-Втор тест:User има username,password што ги задоволува сите критериуми и точен email.Во самата листа нема никој друг идентичен user,Задачата враќа true

-Трет тест:User има username null,password<8, и mail ист со друг корисник.Задачата враќа false

-Четврт тест:User има ист username со друг корисник,password со празно место и mail точен.Задачата враќа false

-Петти тест:User има username,password без специјални знаци и mail погрешен..Во самата листа нема никој друг идентичен user.Задачата враќа false

Multiple Condition

-Прв тест:user е null.Задачата фрла execption.

-Втор тест:user има username и mail,нема password.Задачата фрла execption.

-Трет тест:user има username и password.Нема mail.Задачата фрла execption.

-Четврти тест: user има username,password и mail.Задачата не фрла execption.
