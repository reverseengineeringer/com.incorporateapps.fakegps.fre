package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafeBrowsingData;

public abstract class zzrc$zza
  extends Binder
  implements zzrc
{
  public zzrc$zza()
  {
    attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
  }
  
  public static zzrc zzdU(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzrc))) {
      return (zzrc)localIInterface;
    }
    return new zzrc.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        paramParcel2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label121;
        }
      }
      for (paramParcel1 = (AttestationData)AttestationData.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza(paramParcel2, paramParcel1);
        return true;
        paramParcel2 = null;
        break;
      }
    case 2: 
      label121:
      paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
      zzfI(paramParcel1.readString());
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    if (paramParcel1.readInt() != 0)
    {
      paramParcel2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0) {
        break label201;
      }
    }
    label201:
    for (paramParcel1 = (SafeBrowsingData)SafeBrowsingData.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zza(paramParcel2, paramParcel1);
      return true;
      paramParcel2 = null;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrc.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */