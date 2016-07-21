package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.zzd;
import com.google.android.gms.common.internal.zzx;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class zzlh
  extends zzlg
{
  public static final List zzYf = Collections.singletonList("email");
  private Class zzYg;
  private Class zzYh;
  private Object zzYi;
  private Object zzYj;
  
  public zzlh(Activity paramActivity, List paramList)
  {
    super(paramActivity, zzYf, paramList);
  }
  
  /* Error */
  public static void zzag(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 56	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: ldc 58
    //   7: invokestatic 64	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   10: astore_1
    //   11: aload_1
    //   12: ldc 66
    //   14: iconst_2
    //   15: anewarray 60	java/lang/Class
    //   18: dup
    //   19: iconst_0
    //   20: ldc 68
    //   22: aastore
    //   23: dup
    //   24: iconst_1
    //   25: getstatic 73	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   28: aastore
    //   29: invokevirtual 77	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   32: aconst_null
    //   33: iconst_2
    //   34: anewarray 79	java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: aload_0
    //   40: invokevirtual 83	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   43: aastore
    //   44: dup
    //   45: iconst_1
    //   46: ldc 84
    //   48: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   51: aastore
    //   52: invokevirtual 94	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   55: pop
    //   56: ldc 96
    //   58: invokestatic 64	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   61: astore_0
    //   62: aload_0
    //   63: ldc 98
    //   65: iconst_0
    //   66: anewarray 60	java/lang/Class
    //   69: invokevirtual 77	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   72: aconst_null
    //   73: iconst_0
    //   74: anewarray 79	java/lang/Object
    //   77: invokevirtual 94	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   80: astore_1
    //   81: aload_0
    //   82: ldc 100
    //   84: iconst_0
    //   85: anewarray 60	java/lang/Class
    //   88: invokevirtual 77	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   91: aload_1
    //   92: iconst_0
    //   93: anewarray 79	java/lang/Object
    //   96: invokevirtual 94	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   99: pop
    //   100: return
    //   101: astore_0
    //   102: ldc 102
    //   104: ldc 104
    //   106: aload_0
    //   107: invokestatic 110	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   110: pop
    //   111: new 112	java/lang/IllegalStateException
    //   114: dup
    //   115: ldc 114
    //   117: invokespecial 117	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   120: athrow
    //   121: astore_0
    //   122: ldc 119
    //   124: invokestatic 64	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   127: astore_0
    //   128: aload_0
    //   129: ldc 121
    //   131: iconst_0
    //   132: anewarray 60	java/lang/Class
    //   135: invokevirtual 77	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   138: aconst_null
    //   139: iconst_0
    //   140: anewarray 79	java/lang/Object
    //   143: invokevirtual 94	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   146: astore_1
    //   147: aload_1
    //   148: ifnull -48 -> 100
    //   151: aload_0
    //   152: ldc 123
    //   154: iconst_0
    //   155: anewarray 60	java/lang/Class
    //   158: invokevirtual 77	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   161: aload_1
    //   162: iconst_0
    //   163: anewarray 79	java/lang/Object
    //   166: invokevirtual 94	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   169: pop
    //   170: return
    //   171: astore_0
    //   172: ldc 102
    //   174: ldc 104
    //   176: aload_0
    //   177: invokestatic 110	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   180: pop
    //   181: new 112	java/lang/IllegalStateException
    //   184: dup
    //   185: ldc 114
    //   187: invokespecial 117	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   190: athrow
    //   191: astore_0
    //   192: goto -20 -> 172
    //   195: astore_0
    //   196: goto -24 -> 172
    //   199: astore_0
    //   200: goto -28 -> 172
    //   203: astore_0
    //   204: goto -102 -> 102
    //   207: astore_0
    //   208: goto -106 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	paramContext	Context
    //   10	152	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	100	101	java/lang/IllegalAccessException
    //   5	11	121	java/lang/ClassNotFoundException
    //   11	100	121	java/lang/ClassNotFoundException
    //   102	121	121	java/lang/ClassNotFoundException
    //   122	147	171	java/lang/ClassNotFoundException
    //   151	170	171	java/lang/ClassNotFoundException
    //   122	147	191	java/lang/IllegalAccessException
    //   151	170	191	java/lang/IllegalAccessException
    //   122	147	195	java/lang/NoSuchMethodException
    //   151	170	195	java/lang/NoSuchMethodException
    //   122	147	199	java/lang/reflect/InvocationTargetException
    //   151	170	199	java/lang/reflect/InvocationTargetException
    //   11	100	203	java/lang/NoSuchMethodException
    //   11	100	207	java/lang/reflect/InvocationTargetException
  }
  
  private void zznv()
  {
    if (zzYj != null)
    {
      Class.forName("com.facebook.login.LoginManager").getDeclaredMethod("logInWithReadPermissions", new Class[] { Activity.class, Collection.class }).invoke(zzYj, new Object[] { mActivity, new ArrayList(zzns()) });
      return;
    }
    Class localClass1 = Class.forName("com.facebook.Session$OpenRequest");
    Object localObject1 = localClass1.getConstructor(new Class[] { Activity.class }).newInstance(new Object[] { mActivity });
    localClass1.getDeclaredMethod("setPermissions", new Class[] { List.class }).invoke(localObject1, new Object[] { new ArrayList(zzns()) });
    localClass1.getDeclaredMethod("setRequestCode", new Class[] { Integer.TYPE }).invoke(localObject1, new Object[] { Integer.valueOf(64206) });
    Class localClass2 = Class.forName("com.facebook.Session");
    localClass1.getDeclaredMethod("setCallback", new Class[] { Class.forName("com.facebook.Session$StatusCallback") }).invoke(localObject1, new Object[] { zznw() });
    Object localObject2 = localClass2.getConstructor(new Class[] { Context.class }).newInstance(new Object[] { mActivity });
    localClass2.getDeclaredMethod("setActiveSession", new Class[] { localClass2 }).invoke(null, new Object[] { localObject2 });
    localClass2.getDeclaredMethod("openForRead", new Class[] { localClass1 }).invoke(localObject2, new Object[] { localObject1 });
  }
  
  private Object zznw()
  {
    Object localObject = Class.forName("com.facebook.Session");
    Class localClass = Class.forName("com.facebook.Session$StatusCallback");
    ClassLoader localClassLoader = localClass.getClassLoader();
    localObject = new zzlh.1(this, (Class)localObject);
    return Proxy.newProxyInstance(localClassLoader, new Class[] { localClass }, (InvocationHandler)localObject);
  }
  
  public void zza(zzlf.zza paramzza)
  {
    zzb(null, null, (zzlf.zza)zzx.zzz(paramzza));
    try
    {
      zznv();
      return;
    }
    catch (ClassNotFoundException paramzza)
    {
      throw new RuntimeException(paramzza);
    }
    catch (NoSuchMethodException paramzza)
    {
      for (;;) {}
    }
    catch (IllegalAccessException paramzza)
    {
      for (;;) {}
    }
    catch (InvocationTargetException paramzza)
    {
      for (;;) {}
    }
    catch (InstantiationException paramzza)
    {
      for (;;) {}
    }
  }
  
  public void zza(String paramString, zzlf.zza paramzza)
  {
    zzb((String)zzx.zzz(paramString), null, (zzlf.zza)zzx.zzz(paramzza));
    try
    {
      zznv();
      return;
    }
    catch (ClassNotFoundException paramString)
    {
      throw new RuntimeException(paramString);
    }
    catch (NoSuchMethodException paramString)
    {
      for (;;) {}
    }
    catch (IllegalAccessException paramString)
    {
      for (;;) {}
    }
    catch (InvocationTargetException paramString)
    {
      for (;;) {}
    }
    catch (InstantiationException paramString)
    {
      for (;;) {}
    }
  }
  
  public void zza(String paramString1, String paramString2, zzlf.zza paramzza)
  {
    zzb((String)zzx.zzz(paramString1), (String)zzx.zzz(paramString2), (zzlf.zza)zzx.zzz(paramzza));
    try
    {
      zznv();
      return;
    }
    catch (ClassNotFoundException paramString1)
    {
      throw new RuntimeException(paramString1);
    }
    catch (NoSuchMethodException paramString1)
    {
      for (;;) {}
    }
    catch (IllegalAccessException paramString1)
    {
      for (;;) {}
    }
    catch (InvocationTargetException paramString1)
    {
      for (;;) {}
    }
    catch (InstantiationException paramString1)
    {
      for (;;) {}
    }
  }
  
  public boolean zza(int paramInt1, int paramInt2, Intent paramIntent, zzlf.zza paramzza)
  {
    zzb(paramzza);
    if ((paramInt1 != 64206) && (zzYg == null)) {
      return false;
    }
    if ((zzYg != null) && (zzYh != null) && (zzYi != null)) {}
    try
    {
      if (!((Boolean)zzYg.getDeclaredMethod("isFacebookRequestCode", new Class[] { Integer.TYPE }).invoke(null, new Object[] { Integer.valueOf(paramInt1) })).booleanValue()) {
        return false;
      }
      bool = ((Boolean)zzYh.getDeclaredMethod("onActivityResult", new Class[] { Integer.TYPE, Integer.TYPE, Intent.class }).invoke(zzYi, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramIntent })).booleanValue();
      return bool;
    }
    catch (IllegalAccessException paramIntent)
    {
      boolean bool;
      throw new RuntimeException(paramIntent);
      try
      {
        Object localObject = Class.forName("com.facebook.Session");
        paramzza = ((Class)localObject).getDeclaredMethod("getActiveSession", new Class[0]).invoke(null, new Object[0]);
        localObject = ((Class)localObject).getDeclaredMethod("onActivityResult", new Class[] { Activity.class, Integer.TYPE, Integer.TYPE, Intent.class });
        if (paramzza == null) {
          return false;
        }
        bool = ((Boolean)((Method)localObject).invoke(paramzza, new Object[] { mActivity, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramIntent })).booleanValue();
        return bool;
      }
      catch (ClassNotFoundException paramIntent)
      {
        throw new RuntimeException(paramIntent);
      }
      catch (IllegalAccessException paramIntent)
      {
        for (;;) {}
      }
      catch (NoSuchMethodException paramIntent)
      {
        for (;;) {}
      }
      catch (InvocationTargetException paramIntent)
      {
        for (;;) {}
      }
    }
    catch (NoSuchMethodException paramIntent)
    {
      for (;;) {}
    }
    catch (InvocationTargetException paramIntent)
    {
      for (;;) {}
    }
  }
  
  public zzd zzmU()
  {
    return zzd.zzXi;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */