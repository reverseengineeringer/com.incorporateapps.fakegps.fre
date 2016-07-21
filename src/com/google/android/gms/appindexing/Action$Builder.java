package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;

public final class Action$Builder
  extends Thing.Builder
{
  public Action$Builder(String paramString)
  {
    zzx.zzz(paramString);
    super.put("type", paramString);
  }
  
  public final Action build()
  {
    zzx.zzb(zzUH.get("object"), "setObject is required before calling build().");
    zzx.zzb(zzUH.get("type"), "setType is required before calling build().");
    Bundle localBundle = (Bundle)zzUH.getParcelable("object");
    zzx.zzb(localBundle.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
    zzx.zzb(localBundle.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
    return new Action(zzUH, null);
  }
  
  public final Builder put(String paramString, Thing paramThing)
  {
    return (Builder)super.put(paramString, paramThing);
  }
  
  public final Builder put(String paramString1, String paramString2)
  {
    return (Builder)super.put(paramString1, paramString2);
  }
  
  public final Builder put(String paramString, boolean paramBoolean)
  {
    return (Builder)super.put(paramString, paramBoolean);
  }
  
  public final Builder put(String paramString, Thing[] paramArrayOfThing)
  {
    return (Builder)super.put(paramString, paramArrayOfThing);
  }
  
  public final Builder put(String paramString, String[] paramArrayOfString)
  {
    return (Builder)super.put(paramString, paramArrayOfString);
  }
  
  public final Builder setActionStatus(String paramString)
  {
    zzx.zzz(paramString);
    return (Builder)super.put("actionStatus", paramString);
  }
  
  public final Builder setName(String paramString)
  {
    return (Builder)super.put("name", paramString);
  }
  
  public final Builder setObject(Thing paramThing)
  {
    zzx.zzz(paramThing);
    return (Builder)super.put("object", paramThing);
  }
  
  public final Builder setUrl(Uri paramUri)
  {
    if (paramUri != null) {
      super.put("url", paramUri.toString());
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appindexing.Action.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */