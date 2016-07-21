package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchaseResult;

public class zzgk
  implements InAppPurchaseResult
{
  private final zzgg zzGb;
  
  public zzgk(zzgg paramzzgg)
  {
    zzGb = paramzzgg;
  }
  
  public void finishPurchase()
  {
    try
    {
      zzGb.finishPurchase();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward finishPurchase to InAppPurchaseResult", localRemoteException);
    }
  }
  
  public String getProductId()
  {
    try
    {
      String str = zzGb.getProductId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward getProductId to InAppPurchaseResult", localRemoteException);
    }
    return null;
  }
  
  public Intent getPurchaseData()
  {
    try
    {
      Intent localIntent = zzGb.getPurchaseData();
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward getPurchaseData to InAppPurchaseResult", localRemoteException);
    }
    return null;
  }
  
  public int getResultCode()
  {
    try
    {
      int i = zzGb.getResultCode();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward getPurchaseData to InAppPurchaseResult", localRemoteException);
    }
    return 0;
  }
  
  public boolean isVerified()
  {
    try
    {
      boolean bool = zzGb.isVerified();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward isVerified to InAppPurchaseResult", localRemoteException);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */