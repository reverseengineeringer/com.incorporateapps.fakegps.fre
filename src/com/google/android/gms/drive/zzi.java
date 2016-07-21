package com.google.android.gms.drive;

public class zzi
  extends ExecutionOptions
{
  private boolean zzapa;
  
  private zzi(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    super(paramString, paramBoolean1, paramInt);
    zzapa = paramBoolean2;
  }
  
  public static zzi zzb(ExecutionOptions paramExecutionOptions)
  {
    zzi.zza localzza = new zzi.zza();
    if (paramExecutionOptions != null)
    {
      localzza.zzcy(paramExecutionOptions.zzsD());
      localzza.zzae(paramExecutionOptions.zzsC());
      paramExecutionOptions = paramExecutionOptions.zzsB();
      if (paramExecutionOptions != null) {
        localzza.zzcZ(paramExecutionOptions);
      }
    }
    return localzza.zzsJ();
  }
  
  public boolean zzsI()
  {
    return zzapa;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */