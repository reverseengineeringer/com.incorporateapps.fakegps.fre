package com.google.android.gms.drive;

public class ExecutionOptions$Builder
{
  protected String zzaoV;
  protected boolean zzaoW;
  protected int zzaoX = 0;
  
  public ExecutionOptions build()
  {
    zzsE();
    return new ExecutionOptions(zzaoV, zzaoW, zzaoX);
  }
  
  public Builder setConflictStrategy(int paramInt)
  {
    if (!ExecutionOptions.zzcw(paramInt)) {
      throw new IllegalArgumentException("Unrecognized value for conflict strategy: " + paramInt);
    }
    zzaoX = paramInt;
    return this;
  }
  
  public Builder setNotifyOnCompletion(boolean paramBoolean)
  {
    zzaoW = paramBoolean;
    return this;
  }
  
  public Builder setTrackingTag(String paramString)
  {
    if (!ExecutionOptions.zzcX(paramString)) {
      throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[] { Integer.valueOf(65536) }));
    }
    zzaoV = paramString;
    return this;
  }
  
  protected void zzsE()
  {
    if ((zzaoX == 1) && (!zzaoW)) {
      throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.ExecutionOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */