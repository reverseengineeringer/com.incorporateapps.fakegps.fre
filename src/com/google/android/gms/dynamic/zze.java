package com.google.android.gms.dynamic;

import java.lang.reflect.Field;

public final class zze
  extends zzd.zza
{
  private final Object mWrappedObject;
  
  private zze(Object paramObject)
  {
    mWrappedObject = paramObject;
  }
  
  public static zzd zzC(Object paramObject)
  {
    return new zze(paramObject);
  }
  
  public static Object zzp(zzd paramzzd)
  {
    if ((paramzzd instanceof zze)) {
      return mWrappedObject;
    }
    paramzzd = paramzzd.asBinder();
    Object localObject = paramzzd.getClass().getDeclaredFields();
    if (localObject.length == 1)
    {
      localObject = localObject[0];
      if (!((Field)localObject).isAccessible())
      {
        ((Field)localObject).setAccessible(true);
        try
        {
          paramzzd = ((Field)localObject).get(paramzzd);
          return paramzzd;
        }
        catch (NullPointerException paramzzd)
        {
          throw new IllegalArgumentException("Binder object is null.", paramzzd);
        }
        catch (IllegalArgumentException paramzzd)
        {
          throw new IllegalArgumentException("remoteBinder is the wrong class.", paramzzd);
        }
        catch (IllegalAccessException paramzzd)
        {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", paramzzd);
        }
      }
      throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
    throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamic.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */