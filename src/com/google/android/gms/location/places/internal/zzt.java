package com.google.android.gms.location.places.internal;

import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzsk;
import com.google.android.gms.internal.zzst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class zzt
  extends com.google.android.gms.common.data.zzc
{
  private final String TAG = "SafeDataBufferRef";
  
  public zzt(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  protected String zzG(String paramString1, String paramString2)
  {
    String str = paramString2;
    if (zzcz(paramString1))
    {
      str = paramString2;
      if (!zzcB(paramString1)) {
        str = getString(paramString1);
      }
    }
    return str;
  }
  
  protected SafeParcelable zza(String paramString, Parcelable.Creator paramCreator)
  {
    paramString = zzc(paramString, null);
    if (paramString == null) {
      return null;
    }
    return com.google.android.gms.common.internal.safeparcel.zzc.zza(paramString, paramCreator);
  }
  
  protected List zza(String paramString, Parcelable.Creator paramCreator, List paramList)
  {
    paramString = zzc(paramString, null);
    if (paramString == null) {}
    do
    {
      for (;;)
      {
        return paramList;
        try
        {
          Object localObject = zzsk.zzB(paramString);
          if (zzbtV != null)
          {
            paramString = new ArrayList(zzbtV.length);
            localObject = zzbtV;
            int j = localObject.length;
            int i = 0;
            while (i < j)
            {
              paramString.add(com.google.android.gms.common.internal.safeparcel.zzc.zza(localObject[i], paramCreator));
              i += 1;
            }
            return paramString;
          }
        }
        catch (zzst paramString) {}
      }
    } while (!Log.isLoggable("SafeDataBufferRef", 6));
    Log.e("SafeDataBufferRef", "Cannot parse byte[]", paramString);
    return paramList;
  }
  
  protected List zza(String paramString, List paramList)
  {
    paramString = zzc(paramString, null);
    if (paramString == null) {}
    do
    {
      for (;;)
      {
        return paramList;
        try
        {
          paramString = zzsk.zzB(paramString);
          if (zzbtU != null)
          {
            ArrayList localArrayList = new ArrayList(zzbtU.length);
            int i = 0;
            while (i < zzbtU.length)
            {
              localArrayList.add(Integer.valueOf(zzbtU[i]));
              i += 1;
            }
            return localArrayList;
          }
        }
        catch (zzst paramString) {}
      }
    } while (!Log.isLoggable("SafeDataBufferRef", 6));
    Log.e("SafeDataBufferRef", "Cannot parse byte[]", paramString);
    return paramList;
  }
  
  protected float zzb(String paramString, float paramFloat)
  {
    float f = paramFloat;
    if (zzcz(paramString))
    {
      f = paramFloat;
      if (!zzcB(paramString)) {
        f = getFloat(paramString);
      }
    }
    return f;
  }
  
  protected List zzb(String paramString, List paramList)
  {
    paramString = zzc(paramString, null);
    if (paramString == null) {}
    do
    {
      for (;;)
      {
        return paramList;
        try
        {
          paramString = zzsk.zzB(paramString);
          if (zzbtT != null)
          {
            paramString = Arrays.asList(zzbtT);
            return paramString;
          }
        }
        catch (zzst paramString) {}
      }
    } while (!Log.isLoggable("SafeDataBufferRef", 6));
    Log.e("SafeDataBufferRef", "Cannot parse byte[]", paramString);
    return paramList;
  }
  
  protected byte[] zzc(String paramString, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    if (zzcz(paramString))
    {
      arrayOfByte = paramArrayOfByte;
      if (!zzcB(paramString)) {
        arrayOfByte = getByteArray(paramString);
      }
    }
    return arrayOfByte;
  }
  
  protected boolean zzl(String paramString, boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    if (zzcz(paramString))
    {
      bool = paramBoolean;
      if (!zzcB(paramString)) {
        bool = getBoolean(paramString);
      }
    }
    return bool;
  }
  
  protected int zzz(String paramString, int paramInt)
  {
    int i = paramInt;
    if (zzcz(paramString))
    {
      i = paramInt;
      if (!zzcB(paramString)) {
        i = getInteger(paramString);
      }
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */