package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.zze;

public class zzx
  extends zzm.zza
{
  private final zzw zzaTV;
  private final boolean zzaYw;
  
  public zzx(zzw paramzzw)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramzzw);
    zzaTV = paramzzw;
    zzaYw = false;
  }
  
  public zzx(zzw paramzzw, boolean paramBoolean)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramzzw);
    zzaTV = paramzzw;
    zzaYw = paramBoolean;
  }
  
  private void zzfm(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      zzaTV.zzAo().zzCE().zzfg("Measurement Service called without app package");
      throw new SecurityException("Measurement Service called without app package");
    }
    try
    {
      zzfn(paramString);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      zzaTV.zzAo().zzCE().zzj("Measurement Service called with invalid calling package", paramString);
      throw localSecurityException;
    }
  }
  
  private void zzfn(String paramString)
  {
    int i;
    if (zzaYw)
    {
      i = Process.myUid();
      if (!zze.zzb(zzaTV.getContext(), i, paramString)) {
        break label34;
      }
    }
    label34:
    while ((zze.zzf(zzaTV.getContext(), i)) && (!zzaTV.zzCZ()))
    {
      return;
      i = Binder.getCallingUid();
      break;
    }
    throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[] { paramString }));
  }
  
  /* Error */
  public java.util.List zza(AppMetadata paramAppMetadata, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 19	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_0
    //   6: aload_1
    //   7: getfield 117	com/google/android/gms/measurement/internal/AppMetadata:packageName	Ljava/lang/String;
    //   10: invokespecial 119	com/google/android/gms/measurement/internal/zzx:zzfm	(Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield 21	com/google/android/gms/measurement/internal/zzx:zzaTV	Lcom/google/android/gms/measurement/internal/zzw;
    //   17: invokevirtual 123	com/google/android/gms/measurement/internal/zzw:zzCn	()Lcom/google/android/gms/measurement/internal/zzv;
    //   20: new 125	com/google/android/gms/measurement/internal/zzx$6
    //   23: dup
    //   24: aload_0
    //   25: aload_1
    //   26: invokespecial 128	com/google/android/gms/measurement/internal/zzx$6:<init>	(Lcom/google/android/gms/measurement/internal/zzx;Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    //   29: invokevirtual 134	com/google/android/gms/measurement/internal/zzv:zzd	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   32: astore_1
    //   33: aload_1
    //   34: invokeinterface 140 1 0
    //   39: checkcast 142	java/util/List
    //   42: astore_3
    //   43: new 144	java/util/ArrayList
    //   46: dup
    //   47: aload_3
    //   48: invokeinterface 147 1 0
    //   53: invokespecial 150	java/util/ArrayList:<init>	(I)V
    //   56: astore_1
    //   57: aload_3
    //   58: invokeinterface 154 1 0
    //   63: astore_3
    //   64: aload_3
    //   65: invokeinterface 159 1 0
    //   70: ifeq +67 -> 137
    //   73: aload_3
    //   74: invokeinterface 162 1 0
    //   79: checkcast 164	com/google/android/gms/measurement/internal/zzai
    //   82: astore 4
    //   84: iload_2
    //   85: ifne +14 -> 99
    //   88: aload 4
    //   90: getfield 167	com/google/android/gms/measurement/internal/zzai:mName	Ljava/lang/String;
    //   93: invokestatic 173	com/google/android/gms/measurement/internal/zzaj:zzfv	(Ljava/lang/String;)Z
    //   96: ifne -32 -> 64
    //   99: aload_1
    //   100: new 175	com/google/android/gms/measurement/internal/UserAttributeParcel
    //   103: dup
    //   104: aload 4
    //   106: invokespecial 178	com/google/android/gms/measurement/internal/UserAttributeParcel:<init>	(Lcom/google/android/gms/measurement/internal/zzai;)V
    //   109: invokeinterface 182 2 0
    //   114: pop
    //   115: goto -51 -> 64
    //   118: astore_1
    //   119: aload_0
    //   120: getfield 21	com/google/android/gms/measurement/internal/zzx:zzaTV	Lcom/google/android/gms/measurement/internal/zzw;
    //   123: invokevirtual 43	com/google/android/gms/measurement/internal/zzw:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   126: invokevirtual 49	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   129: ldc -72
    //   131: aload_1
    //   132: invokevirtual 67	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   135: aconst_null
    //   136: areturn
    //   137: aload_1
    //   138: areturn
    //   139: astore_1
    //   140: goto -21 -> 119
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	zzx
    //   0	143	1	paramAppMetadata	AppMetadata
    //   0	143	2	paramBoolean	boolean
    //   42	32	3	localObject	Object
    //   82	23	4	localzzai	zzai
    // Exception table:
    //   from	to	target	type
    //   33	64	118	java/lang/InterruptedException
    //   64	84	118	java/lang/InterruptedException
    //   88	99	118	java/lang/InterruptedException
    //   99	115	118	java/lang/InterruptedException
    //   33	64	139	java/util/concurrent/ExecutionException
    //   64	84	139	java/util/concurrent/ExecutionException
    //   88	99	139	java/util/concurrent/ExecutionException
    //   99	115	139	java/util/concurrent/ExecutionException
  }
  
  public void zza(AppMetadata paramAppMetadata)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramAppMetadata);
    zzfm(packageName);
    zzaTV.zzCn().zzg(new zzx.7(this, paramAppMetadata));
  }
  
  public void zza(EventParcel paramEventParcel, AppMetadata paramAppMetadata)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramEventParcel);
    com.google.android.gms.common.internal.zzx.zzz(paramAppMetadata);
    zzfm(packageName);
    zzaTV.zzCn().zzg(new zzx.2(this, paramAppMetadata, paramEventParcel));
  }
  
  public void zza(EventParcel paramEventParcel, String paramString1, String paramString2)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramEventParcel);
    com.google.android.gms.common.internal.zzx.zzcM(paramString1);
    zzfm(paramString1);
    zzaTV.zzCn().zzg(new zzx.3(this, paramString2, paramEventParcel, paramString1));
  }
  
  public void zza(UserAttributeParcel paramUserAttributeParcel, AppMetadata paramAppMetadata)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramUserAttributeParcel);
    com.google.android.gms.common.internal.zzx.zzz(paramAppMetadata);
    zzfm(packageName);
    if (paramUserAttributeParcel.getValue() == null)
    {
      zzaTV.zzCn().zzg(new zzx.4(this, paramAppMetadata, paramUserAttributeParcel));
      return;
    }
    zzaTV.zzCn().zzg(new zzx.5(this, paramAppMetadata, paramUserAttributeParcel));
  }
  
  public void zzb(AppMetadata paramAppMetadata)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramAppMetadata);
    zzfm(packageName);
    zzaTV.zzCn().zzg(new zzx.1(this, paramAppMetadata));
  }
  
  void zzfl(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = paramString.split(":", 2);
      if (paramString.length != 2) {}
    }
    long l;
    try
    {
      l = Long.valueOf(paramString[0]).longValue();
      if (l > 0L)
      {
        zzaTV.zzCo().zzaXi.zzf(paramString[1], l);
        return;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      zzaTV.zzAo().zzCF().zzj("Combining sample with a non-number weight", paramString[0]);
      return;
    }
    zzaTV.zzAo().zzCF().zzj("Combining sample with a non-positive weight", Long.valueOf(l));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */