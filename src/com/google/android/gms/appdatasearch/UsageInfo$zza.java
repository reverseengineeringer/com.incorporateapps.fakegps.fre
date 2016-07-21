package com.google.android.gms.appdatasearch;

public final class UsageInfo$zza
{
  private String zzOJ;
  private DocumentId zzUs;
  private long zzUt = -1L;
  private int zzUu = -1;
  private DocumentContents zzUv;
  private boolean zzUw = false;
  private int zzUx = -1;
  private int zzUy = 0;
  
  public final zza zzO(boolean paramBoolean)
  {
    zzUw = paramBoolean;
    return this;
  }
  
  public final zza zza(DocumentContents paramDocumentContents)
  {
    zzUv = paramDocumentContents;
    return this;
  }
  
  public final zza zza(DocumentId paramDocumentId)
  {
    zzUs = paramDocumentId;
    return this;
  }
  
  public final zza zzar(int paramInt)
  {
    zzUu = paramInt;
    return this;
  }
  
  public final zza zzas(int paramInt)
  {
    zzUy = paramInt;
    return this;
  }
  
  public final UsageInfo zzmi()
  {
    return new UsageInfo(zzUs, zzUt, zzUu, zzOJ, zzUv, zzUw, zzUx, zzUy, null);
  }
  
  public final zza zzw(long paramLong)
  {
    zzUt = paramLong;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appdatasearch.UsageInfo.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */