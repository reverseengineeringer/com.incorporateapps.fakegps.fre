package com.google.android.gms.drive;

public class zzh
  extends ExecutionOptions
{
  private String zzaoY;
  private String zzaoZ;
  
  private zzh(String paramString1, boolean paramBoolean, String paramString2, String paramString3, int paramInt)
  {
    super(paramString1, paramBoolean, paramInt);
    zzaoY = paramString2;
    zzaoZ = paramString3;
  }
  
  public static zzh zza(ExecutionOptions paramExecutionOptions)
  {
    zzh.zza localzza = new zzh.zza();
    if (paramExecutionOptions != null)
    {
      if (paramExecutionOptions.zzsD() != 0) {
        throw new IllegalStateException("May not set a conflict strategy for new file creation.");
      }
      String str = paramExecutionOptions.zzsB();
      if (str != null) {
        localzza.zzcY(str);
      }
      localzza.zzad(paramExecutionOptions.zzsC());
    }
    return localzza.zzsH();
  }
  
  public String zzsF()
  {
    return zzaoY;
  }
  
  public String zzsG()
  {
    return zzaoZ;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */