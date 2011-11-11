---------
About:
---------
Alcohol turns ugly dates:
2011-11-11 11:15:28.213 GMT

into sexy dates:
Today, 4:56 PM


---------
Usage:
---------

Put the taglib groovy file in the taglib directory of your grails project.

Then in your view:
<g:alcohol date="${uglyDate}"></g:alcohol>



---------
Pipeline:
---------
- overload the dateFormat taglib to harness its ju-ju
- support for date differences (2 seconds ago)