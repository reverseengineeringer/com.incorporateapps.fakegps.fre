package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;

public final class NotifyTransactionStatusRequest$Builder
{
  private NotifyTransactionStatusRequest$Builder(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest) {}
  
  public final NotifyTransactionStatusRequest build()
  {
    boolean bool2 = true;
    if (!TextUtils.isEmpty(zzbpA.zzboo))
    {
      bool1 = true;
      zzx.zzb(bool1, "googleTransactionId is required");
      if ((zzbpA.status <= 0) || (zzbpA.status > 8)) {
        break label63;
      }
    }
    label63:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "status is an unrecognized value");
      return zzbpA;
      bool1 = false;
      break;
    }
  }
  
  public final Builder setDetailedReason(String paramString)
  {
    zzbpA.zzbpz = paramString;
    return this;
  }
  
  public final Builder setGoogleTransactionId(String paramString)
  {
    zzbpA.zzboo = paramString;
    return this;
  }
  
  public final Builder setStatus(int paramInt)
  {
    zzbpA.status = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.NotifyTransactionStatusRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */