package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchase;

public class zzgl
  implements InAppPurchase
{
  private final zzgc zzFL;
  
  public zzgl(zzgc paramzzgc)
  {
    zzFL = paramzzgc;
  }
  
  public String getProductId()
  {
    try
    {
      String str = zzFL.getProductId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward getProductId to InAppPurchase", localRemoteException);
    }
    return null;
  }
  
  public void recordPlayBillingResolution(int paramInt)
  {
    try
    {
      zzFL.recordPlayBillingResolution(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward recordPlayBillingResolution to InAppPurchase", localRemoteException);
    }
  }
  
  public void recordResolution(int paramInt)
  {
    try
    {
      zzFL.recordResolution(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not forward recordResolution to InAppPurchase", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */