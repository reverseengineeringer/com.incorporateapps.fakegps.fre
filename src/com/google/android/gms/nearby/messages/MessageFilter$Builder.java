package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
import java.util.List;

public final class MessageFilter$Builder
{
  private final List zzbbC = new ArrayList();
  private boolean zzbbD;
  private final List zzbbE = new ArrayList();
  
  private Builder zzS(String paramString1, String paramString2)
  {
    zzbbE.add(new MessageType(paramString1, paramString2));
    return this;
  }
  
  public final MessageFilter build()
  {
    if ((zzbbD) || (!zzbbE.isEmpty())) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "At least one of the include methods must be called.");
      return new MessageFilter(zzbbE, zzbbC, zzbbD, null);
    }
  }
  
  public final Builder includeAllMyTypes()
  {
    zzbbD = true;
    return this;
  }
  
  public final Builder includeFilter(MessageFilter paramMessageFilter)
  {
    zzbbE.addAll(paramMessageFilter.zzEo());
    zzbbC.addAll(paramMessageFilter.zzEq());
    zzbbD |= paramMessageFilter.zzEp();
    return this;
  }
  
  public final Builder includeNamespacedType(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (!paramString1.isEmpty()) && (!paramString1.contains("*")))
    {
      bool = true;
      zzx.zzb(bool, "namespace(%s) cannot be null, empty or contain (*).", new Object[] { paramString1 });
      if ((paramString2 == null) || (paramString2.contains("*"))) {
        break label77;
      }
    }
    label77:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "type(%s) cannot be null or contain (*).", new Object[] { paramString2 });
      return zzS(paramString1, paramString2);
      bool = false;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.MessageFilter.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */