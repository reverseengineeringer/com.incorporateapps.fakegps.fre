package com.incorporateapps.fakegps.fre;

final class au
  implements Runnable
{
  au(at paramat) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   4: aload_0
    //   5: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   8: invokestatic 32	com/incorporateapps/fakegps/fre/at:a	(Lcom/incorporateapps/fakegps/fre/at;)Landroid/content/Context;
    //   11: ldc 34
    //   13: invokevirtual 40	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   16: checkcast 42	android/location/LocationManager
    //   19: invokestatic 45	com/incorporateapps/fakegps/fre/at:a	(Lcom/incorporateapps/fakegps/fre/at;Landroid/location/LocationManager;)V
    //   22: new 47	android/location/Location
    //   25: dup
    //   26: ldc 49
    //   28: invokespecial 52	android/location/Location:<init>	(Ljava/lang/String;)V
    //   31: astore_1
    //   32: aload_1
    //   33: aload_0
    //   34: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   37: getfield 56	com/incorporateapps/fakegps/fre/at:e	D
    //   40: invokevirtual 60	android/location/Location:setLongitude	(D)V
    //   43: aload_1
    //   44: aload_0
    //   45: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   48: getfield 63	com/incorporateapps/fakegps/fre/at:d	D
    //   51: invokevirtual 66	android/location/Location:setLatitude	(D)V
    //   54: aload_1
    //   55: getstatic 72	com/incorporateapps/fakegps/fre/MockGPSService:b	F
    //   58: invokevirtual 76	android/location/Location:setAccuracy	(F)V
    //   61: aload_1
    //   62: invokestatic 82	java/lang/System:currentTimeMillis	()J
    //   65: invokevirtual 86	android/location/Location:setTime	(J)V
    //   68: ldc 47
    //   70: ldc 88
    //   72: iconst_0
    //   73: anewarray 90	java/lang/Class
    //   76: invokevirtual 94	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   79: astore_2
    //   80: aload_2
    //   81: ifnull +13 -> 94
    //   84: aload_2
    //   85: aload_1
    //   86: iconst_0
    //   87: anewarray 4	java/lang/Object
    //   90: invokevirtual 100	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   93: pop
    //   94: aload_0
    //   95: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   98: invokestatic 103	com/incorporateapps/fakegps/fre/at:b	(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;
    //   101: ldc 49
    //   103: iconst_0
    //   104: iconst_0
    //   105: iconst_0
    //   106: iconst_0
    //   107: iconst_0
    //   108: iconst_0
    //   109: iconst_0
    //   110: iconst_1
    //   111: iconst_1
    //   112: invokevirtual 107	android/location/LocationManager:addTestProvider	(Ljava/lang/String;ZZZZZZZII)V
    //   115: aload_0
    //   116: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   119: invokestatic 103	com/incorporateapps/fakegps/fre/at:b	(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;
    //   122: ldc 49
    //   124: iconst_2
    //   125: aconst_null
    //   126: invokestatic 82	java/lang/System:currentTimeMillis	()J
    //   129: invokevirtual 111	android/location/LocationManager:setTestProviderStatus	(Ljava/lang/String;ILandroid/os/Bundle;J)V
    //   132: aload_0
    //   133: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   136: invokestatic 103	com/incorporateapps/fakegps/fre/at:b	(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;
    //   139: ldc 113
    //   141: iconst_1
    //   142: iconst_0
    //   143: iconst_1
    //   144: iconst_0
    //   145: iconst_0
    //   146: iconst_0
    //   147: iconst_0
    //   148: iconst_1
    //   149: iconst_2
    //   150: invokevirtual 107	android/location/LocationManager:addTestProvider	(Ljava/lang/String;ZZZZZZZII)V
    //   153: aload_0
    //   154: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   157: invokestatic 103	com/incorporateapps/fakegps/fre/at:b	(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;
    //   160: ldc 113
    //   162: iconst_2
    //   163: aconst_null
    //   164: invokestatic 82	java/lang/System:currentTimeMillis	()J
    //   167: invokevirtual 111	android/location/LocationManager:setTestProviderStatus	(Ljava/lang/String;ILandroid/os/Bundle;J)V
    //   170: aload_0
    //   171: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   174: invokestatic 103	com/incorporateapps/fakegps/fre/at:b	(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;
    //   177: ldc 49
    //   179: aload_1
    //   180: invokevirtual 117	android/location/LocationManager:setTestProviderLocation	(Ljava/lang/String;Landroid/location/Location;)V
    //   183: aload_0
    //   184: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   187: invokestatic 103	com/incorporateapps/fakegps/fre/at:b	(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;
    //   190: ldc 113
    //   192: aload_1
    //   193: invokevirtual 117	android/location/LocationManager:setTestProviderLocation	(Ljava/lang/String;Landroid/location/Location;)V
    //   196: aload_0
    //   197: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   200: getfield 121	com/incorporateapps/fakegps/fre/at:f	Landroid/os/Handler;
    //   203: aload_0
    //   204: aload_0
    //   205: getfield 12	com/incorporateapps/fakegps/fre/au:a	Lcom/incorporateapps/fakegps/fre/at;
    //   208: getfield 125	com/incorporateapps/fakegps/fre/at:c	I
    //   211: i2l
    //   212: invokevirtual 131	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   215: pop
    //   216: return
    //   217: astore_2
    //   218: aload_2
    //   219: invokevirtual 134	java/lang/IllegalArgumentException:printStackTrace	()V
    //   222: goto -128 -> 94
    //   225: astore_2
    //   226: aload_2
    //   227: invokevirtual 135	java/lang/NoSuchMethodException:printStackTrace	()V
    //   230: goto -136 -> 94
    //   233: astore_2
    //   234: aload_2
    //   235: invokevirtual 136	java/lang/IllegalAccessException:printStackTrace	()V
    //   238: goto -144 -> 94
    //   241: astore_2
    //   242: aload_2
    //   243: invokevirtual 137	java/lang/reflect/InvocationTargetException:printStackTrace	()V
    //   246: goto -152 -> 94
    //   249: astore_1
    //   250: goto -54 -> 196
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	253	0	this	au
    //   31	162	1	localLocation	android.location.Location
    //   249	1	1	localException	Exception
    //   79	6	2	localMethod	java.lang.reflect.Method
    //   217	2	2	localIllegalArgumentException	IllegalArgumentException
    //   225	2	2	localNoSuchMethodException	NoSuchMethodException
    //   233	2	2	localIllegalAccessException	IllegalAccessException
    //   241	2	2	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    // Exception table:
    //   from	to	target	type
    //   84	94	217	java/lang/IllegalArgumentException
    //   68	80	225	java/lang/NoSuchMethodException
    //   84	94	225	java/lang/NoSuchMethodException
    //   218	222	225	java/lang/NoSuchMethodException
    //   234	238	225	java/lang/NoSuchMethodException
    //   242	246	225	java/lang/NoSuchMethodException
    //   84	94	233	java/lang/IllegalAccessException
    //   84	94	241	java/lang/reflect/InvocationTargetException
    //   94	196	249	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.au
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */