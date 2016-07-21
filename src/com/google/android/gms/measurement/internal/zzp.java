package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.AppMeasurement;

public class zzp
  extends zzz
{
  private final long zzaVj = zzCp().zzBp();
  private final char zzaWB;
  private final zzp.zza zzaWC;
  private final zzp.zza zzaWD;
  private final zzp.zza zzaWE;
  private final zzp.zza zzaWF;
  private final zzp.zza zzaWG;
  private final zzp.zza zzaWH;
  private final zzp.zza zzaWI;
  private final zzp.zza zzaWJ;
  private final zzp.zza zzaWK;
  private final String zzamn = zzCp().zzBz();
  
  zzp(zzw paramzzw)
  {
    super(paramzzw);
    if (zzCp().zzks())
    {
      if (zzCp().zzkr()) {}
      for (c = 'P';; c = 'C')
      {
        zzaWB = c;
        zzaWC = new zzp.zza(this, 6, false, false);
        zzaWD = new zzp.zza(this, 6, true, false);
        zzaWE = new zzp.zza(this, 6, false, true);
        zzaWF = new zzp.zza(this, 5, false, false);
        zzaWG = new zzp.zza(this, 5, true, false);
        zzaWH = new zzp.zza(this, 5, false, true);
        zzaWI = new zzp.zza(this, 4, false, false);
        zzaWJ = new zzp.zza(this, 3, false, false);
        zzaWK = new zzp.zza(this, 2, false, false);
        return;
      }
    }
    if (zzCp().zzkr()) {}
    for (char c = 'p';; c = 'c')
    {
      zzaWB = c;
      break;
    }
  }
  
  static String zza(boolean paramBoolean, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str1 = paramString;
    if (paramString == null) {
      str1 = "";
    }
    String str2 = zzc(paramBoolean, paramObject1);
    paramObject2 = zzc(paramBoolean, paramObject2);
    paramObject3 = zzc(paramBoolean, paramObject3);
    StringBuilder localStringBuilder = new StringBuilder();
    paramString = "";
    if (!TextUtils.isEmpty(str1))
    {
      localStringBuilder.append(str1);
      paramString = ": ";
    }
    paramObject1 = paramString;
    if (!TextUtils.isEmpty(str2))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append(str2);
      paramObject1 = ", ";
    }
    paramString = (String)paramObject1;
    if (!TextUtils.isEmpty((CharSequence)paramObject2))
    {
      localStringBuilder.append((String)paramObject1);
      localStringBuilder.append((String)paramObject2);
      paramString = ", ";
    }
    if (!TextUtils.isEmpty((CharSequence)paramObject3))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append((String)paramObject3);
    }
    return localStringBuilder.toString();
  }
  
  static String zzc(boolean paramBoolean, Object paramObject)
  {
    if (paramObject == null) {
      return "";
    }
    if ((paramObject instanceof Integer)) {
      paramObject = Long.valueOf(((Integer)paramObject).intValue());
    }
    for (;;)
    {
      String str1;
      if ((paramObject instanceof Long))
      {
        if (!paramBoolean) {
          return String.valueOf(paramObject);
        }
        if (Math.abs(((Long)paramObject).longValue()) < 100L) {
          return String.valueOf(paramObject);
        }
        if (String.valueOf(paramObject).charAt(0) == '-') {}
        for (str1 = "-";; str1 = "")
        {
          paramObject = String.valueOf(Math.abs(((Long)paramObject).longValue()));
          return str1 + Math.round(Math.pow(10.0D, ((String)paramObject).length() - 1)) + "..." + str1 + Math.round(Math.pow(10.0D, ((String)paramObject).length()) - 1.0D);
        }
      }
      if ((paramObject instanceof Boolean)) {
        return String.valueOf(paramObject);
      }
      if ((paramObject instanceof Throwable))
      {
        Object localObject1 = (Throwable)paramObject;
        paramObject = new StringBuilder(((Throwable)localObject1).toString());
        str1 = zzff(AppMeasurement.class.getCanonicalName());
        String str2 = zzff(zzw.class.getCanonicalName());
        localObject1 = ((Throwable)localObject1).getStackTrace();
        int j = localObject1.length;
        int i = 0;
        for (;;)
        {
          if (i < j)
          {
            Object localObject2 = localObject1[i];
            if (!((StackTraceElement)localObject2).isNativeMethod())
            {
              String str3 = ((StackTraceElement)localObject2).getClassName();
              if (str3 != null)
              {
                str3 = zzff(str3);
                if ((str3.equals(str1)) || (str3.equals(str2)))
                {
                  ((StringBuilder)paramObject).append(": ");
                  ((StringBuilder)paramObject).append(localObject2);
                }
              }
            }
          }
          else
          {
            return ((StringBuilder)paramObject).toString();
          }
          i += 1;
        }
      }
      if (paramBoolean) {
        return "-";
      }
      return String.valueOf(paramObject);
    }
  }
  
  private static String zzff(String paramString)
  {
    String str;
    if (TextUtils.isEmpty(paramString)) {
      str = "";
    }
    int i;
    do
    {
      return str;
      i = paramString.lastIndexOf('.');
      str = paramString;
    } while (i == -1);
    return paramString.substring(0, i);
  }
  
  public zzp.zza zzCE()
  {
    return zzaWC;
  }
  
  public zzp.zza zzCF()
  {
    return zzaWF;
  }
  
  public zzp.zza zzCG()
  {
    return zzaWG;
  }
  
  public zzp.zza zzCH()
  {
    return zzaWH;
  }
  
  public zzp.zza zzCI()
  {
    return zzaWI;
  }
  
  public zzp.zza zzCJ()
  {
    return zzaWJ;
  }
  
  public zzp.zza zzCK()
  {
    return zzaWK;
  }
  
  public String zzCL()
  {
    Pair localPair = zzCozzaXi.zzlN();
    if (localPair == null) {
      return null;
    }
    return String.valueOf(second) + ":" + (String)first;
  }
  
  protected boolean zzQ(int paramInt)
  {
    return Log.isLoggable(zzamn, paramInt);
  }
  
  protected void zza(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    if ((!paramBoolean1) && (zzQ(paramInt))) {
      zzl(paramInt, zza(false, paramString, paramObject1, paramObject2, paramObject3));
    }
    if ((!paramBoolean2) && (paramInt >= 5)) {
      zzb(paramInt, paramString, paramObject1, paramObject2, paramObject3);
    }
  }
  
  public void zzb(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    zzx.zzz(paramString);
    zzv localzzv = zzaTV.zzCU();
    if (localzzv == null)
    {
      zzl(6, "Scheduler not set. Not logging error/warn.");
      return;
    }
    if (!localzzv.isInitialized())
    {
      zzl(6, "Scheduler not initialized. Not logging error/warn.");
      return;
    }
    if (localzzv.zzDi())
    {
      zzl(6, "Scheduler shutdown. Not logging error/warn.");
      return;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (;;)
    {
      int i = paramInt;
      if (paramInt >= 9) {
        i = 8;
      }
      paramObject2 = "1" + "01VDIWEA?".charAt(i) + zzaWB + zzaVj + ":" + zza(true, paramString, paramObject1, paramObject2, paramObject3);
      paramObject1 = paramObject2;
      if (((String)paramObject2).length() > 1024) {
        paramObject1 = paramString.substring(0, 1024);
      }
      localzzv.zzg(new zzp.1(this, (String)paramObject1));
      return;
    }
  }
  
  protected void zziJ() {}
  
  protected void zzl(int paramInt, String paramString)
  {
    Log.println(paramInt, zzamn, paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */