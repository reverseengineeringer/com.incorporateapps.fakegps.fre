package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

public class zzbh
{
  private final int zztp;
  private final int zztq;
  private final int zztr;
  private final zzbg zzts = new zzbj();
  
  public zzbh(int paramInt)
  {
    zztq = paramInt;
    zztp = 6;
    zztr = 0;
  }
  
  private String zzv(String paramString)
  {
    String[] arrayOfString = paramString.split("\n");
    if (arrayOfString.length == 0) {
      return "";
    }
    paramString = zzcM();
    Arrays.sort(arrayOfString, new zzbh.1(this));
    int i = 0;
    for (;;)
    {
      if ((i < arrayOfString.length) && (i < zztq))
      {
        if (arrayOfString[i].trim().length() != 0) {}
        try
        {
          paramString.write(zzts.zzu(arrayOfString[i]));
          i += 1;
        }
        catch (IOException localIOException)
        {
          zzin.zzb("Error while writing hash to byteStream", localIOException);
        }
      }
    }
    return paramString.toString();
  }
  
  public String zza(ArrayList paramArrayList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      localStringBuffer.append(((String)paramArrayList.next()).toLowerCase(Locale.US));
      localStringBuffer.append('\n');
    }
    switch (zztr)
    {
    default: 
      return "";
    case 0: 
      return zzw(localStringBuffer.toString());
    }
    return zzv(localStringBuffer.toString());
  }
  
  zzbh.zza zzcM()
  {
    return new zzbh.zza();
  }
  
  String zzw(String paramString)
  {
    Object localObject1 = paramString.split("\n");
    if (localObject1.length == 0) {
      return "";
    }
    paramString = zzcM();
    Object localObject2 = new PriorityQueue(zztq, new zzbh.2(this));
    int i = 0;
    while (i < localObject1.length)
    {
      String[] arrayOfString = zzbi.zzy(localObject1[i]);
      if (arrayOfString.length != 0) {
        zzbk.zza(arrayOfString, zztq, zztp, (PriorityQueue)localObject2);
      }
      i += 1;
    }
    localObject1 = ((PriorityQueue)localObject2).iterator();
    for (;;)
    {
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zzbk.zza)((Iterator)localObject1).next();
        try
        {
          paramString.write(zzts.zzu(zztx));
        }
        catch (IOException localIOException)
        {
          zzin.zzb("Error while writing hash to byteStream", localIOException);
        }
      }
    }
    return paramString.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */