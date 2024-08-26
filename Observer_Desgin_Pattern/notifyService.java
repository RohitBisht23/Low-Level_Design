<<<<<<< HEAD
/*
Let say you are the owner of the mobile phone shop and you have multiple mobile phones.
One day customer came and ask for Iphone 13 and you dont have that.
You tell them to come after few days.

Now here two situation arries ->
1-> Customer come everyday and check if now available or not (Useless)
2-> You send a notification to them that now it is available.
 */

import java.util.*;
class NotificationService {
    List<String> curstomerEmailList; //Reference variable created only

    public NotificationService() {
        curstomerEmailList = new ArrayList<>();
    }

    public void updateCustomer() {
        curstomerEmailList.forEach(CustomerEmail -> System.out.println("Notification email sent successfully"));
    }
}

class notifyService {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.curstomerEmailList.add("rohitbishit0911@gmail.com");
        notificationService.curstomerEmailList.add("bishtrohit3002@gmail.com");
        notificationService.curstomerEmailList.add("xyz@gmail.com");
        notificationService.curstomerEmailList.add("abc@gmail.com");

        notificationService.updateCustomer();
    }
}

/*
The above code is not extensible because now if some customer don't want notification in main
they need the sms notification. And they want notification of difference kind of product
For that we need to update the function again and again, which voilate the 'O' Principle rule
which says any class is open for extesion and now for modification.

Now observer design principle come into picture.
=======
/*
Let say you are the owner of the mobile phone shop and you have multiple mobile phones.
One day customer came and ask for Iphone 13 and you dont have that.
You tell them to come after few days.

Now here two situation arries ->
1-> Customer come everyday and check if now available or not (Useless)
2-> You send a notification to them that now it is available.
 */

import java.util.*;
class NotificationService {
    List<String> curstomerEmailList; //Reference variable created only

    public NotificationService() {
        curstomerEmailList = new ArrayList<>();
    }

    public void updateCustomer() {
        curstomerEmailList.forEach(CustomerEmail -> System.out.println("Notification email sent successfully"));
    }
}

class notifyService {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.curstomerEmailList.add("rohitbishit0911@gmail.com");
        notificationService.curstomerEmailList.add("bishtrohit3002@gmail.com");
        notificationService.curstomerEmailList.add("xyz@gmail.com");
        notificationService.curstomerEmailList.add("abc@gmail.com");

        notificationService.updateCustomer();
    }
}

/*
The above code is not extensible because now if some customer don't want notification in main
they need the sms notification. And they want notification of difference kind of product
For that we need to update the function again and again, which voilate the 'O' Principle rule
which says any class is open for extesion and now for modification.

Now observer design principle come into picture.
>>>>>>> f59ca64b734c234aad887cc39deb57003e35b423
 */