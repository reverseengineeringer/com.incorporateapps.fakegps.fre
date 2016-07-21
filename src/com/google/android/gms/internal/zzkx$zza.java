package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.consent.GetConsentIntentRequest;

public abstract class zzkx$zza
  extends Binder
  implements zzkx
{
  public static zzkx zzau(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.consent.internal.IConsentService");
    if ((localIInterface != null) && ((localIInterface instanceof zzkx))) {
      return (zzkx)localIInterface;
    }
    return new zzkx.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.auth.api.consent.internal.IConsentService");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.consent.internal.IConsentService");
    if (paramParcel1.readInt() != 0)
    {
      paramParcel1 = (GetConsentIntentRequest)GetConsentIntentRequest.CREATOR.createFromParcel(paramParcel1);
      paramParcel1 = zza(paramParcel1);
      paramParcel2.writeNoException();
      if (paramParcel1 == null) {
        break label104;
      }
      paramParcel2.writeInt(1);
      paramParcel1.writeToParcel(paramParcel2, 1);
    }
    for (;;)
    {
      return true;
      paramParcel1 = null;
      break;
      label104:
      paramParcel2.writeInt(0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkx.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */