package com.google.android.gms.common.api;

class Batch$1
  implements PendingResult.zza
{
  Batch$1(Batch paramBatch) {}
  
  public void zzu(Status paramStatus)
  {
    for (;;)
    {
      synchronized (Batch.zza(zzagd))
      {
        if (zzagd.isCanceled()) {
          return;
        }
        if (paramStatus.isCanceled())
        {
          Batch.zza(zzagd, true);
          Batch.zzb(zzagd);
          if (Batch.zzc(zzagd) == 0)
          {
            if (!Batch.zzd(zzagd)) {
              break;
            }
            Batch.zze(zzagd);
          }
          return;
        }
      }
      if (!paramStatus.isSuccess()) {
        Batch.zzb(zzagd, true);
      }
    }
    if (Batch.zzf(zzagd)) {}
    for (paramStatus = new Status(13);; paramStatus = Status.zzagC)
    {
      zzagd.zza(new BatchResult(paramStatus, Batch.zzg(zzagd)));
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.Batch.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */