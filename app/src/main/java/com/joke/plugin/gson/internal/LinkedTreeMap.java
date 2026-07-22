package com.joke.plugin.gson.internal;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.EntrySet entrySet;
    final Node<K, V> header;
    private LinkedTreeMap<K, V>.KeySet keySet;
    int modCount;
    Node<K, V> root;
    int size;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f175short = {3073, 3144, 3154, 3073, 3151, 3150, 3157, 3073, 3170, 3150, 3148, 3153, 3136, 3155, 3136, 3139, 3149, 3140, 2908, 2898, 2894, 2839, 2826, 2826, 2839, 2905, 2882, 2907, 2907};
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() { // from class: com.joke.plugin.gson.internal.LinkedTreeMap.1
        /* JADX INFO: renamed from: ۣۥۢۥ, reason: not valid java name and contains not printable characters */
        public static int m5168(Object obj, Object obj2, Object obj3) {
            if (C0020.m1385() < 0) {
                return ((AnonymousClass1) obj).compare2((Comparable) obj2, (Comparable) obj3);
            }
            return 0;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return m5168(this, comparable, comparable2);
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Comparable comparable, Comparable comparable2) {
            return C0022.m1768(comparable, comparable2);
        }
    };

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        /* JADX INFO: renamed from: ۟۠ۢۡۧ, reason: not valid java name and contains not printable characters */
        public static int m5169(Object obj) {
            if (C0016.m717() <= 0) {
                return ((LinkedTreeMap) obj).size;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
        public static Node m5170(Object obj, Object obj2) {
            if (C0023.m1921() > 0) {
                return ((LinkedTreeMap) obj).findByEntry((Map.Entry) obj2);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۧۡۥۨ, reason: not valid java name and contains not printable characters */
        public static void m5171(Object obj, Object obj2, boolean z) {
            if (C0064.m4578() >= 0) {
                ((LinkedTreeMap) obj).removeInternal((Node) obj2, z);
            }
        }

        /* JADX INFO: renamed from: ۦۣۢۨ, reason: contains not printable characters */
        public static LinkedTreeMap m5172(Object obj) {
            if (C0071.m6069() > 0) {
                return LinkedTreeMap.this;
            }
            return null;
        }

        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0021.m1637(m5172(this));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && m5170(m5172(this), (Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() { // from class: com.joke.plugin.gson.internal.LinkedTreeMap.EntrySet.1
                /* JADX INFO: renamed from: ۤۡۧۧ, reason: not valid java name and contains not printable characters */
                public static Node m5173(Object obj) {
                    if (C0072.m6216() >= 0) {
                        return ((LinkedTreeMapIterator) obj).nextNode();
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۥۨۨ, reason: contains not printable characters */
                public static LinkedTreeMap m5174(Object obj) {
                    if (C0030.m2940() > 0) {
                        return LinkedTreeMap.this;
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۦۢۤۨ, reason: contains not printable characters */
                public static Map.Entry m5175(Object obj) {
                    if (C0069.m5781() <= 0) {
                        return ((AnonymousClass1) obj).next();
                    }
                    return null;
                }

                @Override // java.util.Iterator
                public /* bridge */ /* synthetic */ Object next() {
                    return m5175(this);
                }

                {
                    m5174(EntrySet.this);
                }

                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    return m5173(this);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Node nodeM5170;
            if (!(obj instanceof Map.Entry) || (nodeM5170 = m5170(m5172(this), (Map.Entry) obj)) == null) {
                return false;
            }
            m5171(m5172(this), nodeM5170, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m5169(m5172(this));
        }
    }

    public final class KeySet extends AbstractSet<K> {
        /* JADX INFO: renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
        public static LinkedTreeMap m5176(Object obj) {
            if (C0076.m6903() <= 0) {
                return LinkedTreeMap.this;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۧۤۥۣ, reason: not valid java name and contains not printable characters */
        public static Node m5177(Object obj, Object obj2) {
            if (C0074.m6454() <= 0) {
                return ((LinkedTreeMap) obj).removeInternalByKey(obj2);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۧۥ, reason: not valid java name and contains not printable characters */
        public static int m5178(Object obj) {
            if (C0016.m717() <= 0) {
                return ((LinkedTreeMap) obj).size;
            }
            return 0;
        }

        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0021.m1637(m5176(this));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C0072.m6132(m5176(this), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.joke.plugin.gson.internal.LinkedTreeMap.KeySet.1
                /* JADX INFO: renamed from: ۟ۡ۟ۡۡ, reason: not valid java name and contains not printable characters */
                public static Node m5179(Object obj) {
                    if (C0023.m1921() >= 0) {
                        return ((LinkedTreeMapIterator) obj).nextNode();
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۟ۡۧۤ۟, reason: not valid java name and contains not printable characters */
                public static Object m5180(Object obj) {
                    if (C0036.m3653() < 0) {
                        return ((Node) obj).key;
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۟ۦۢۨۡ, reason: not valid java name and contains not printable characters */
                public static LinkedTreeMap m5181(Object obj) {
                    if (C0033.m3358() < 0) {
                        return LinkedTreeMap.this;
                    }
                    return null;
                }

                {
                    m5181(KeySet.this);
                }

                @Override // java.util.Iterator
                public K next() {
                    return (K) m5180(m5179(this));
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return m5177(m5176(this), obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m5178(m5176(this));
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        int expectedModCount;
        Node<K, V> lastReturned = null;
        Node<K, V> next;

        /* JADX INFO: renamed from: ۣ۟ۢ۟ۧ, reason: not valid java name and contains not printable characters */
        public static Node m5182(Object obj) {
            if (C0036.m3653() <= 0) {
                return ((LinkedTreeMap) obj).header;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۦۦۤ, reason: not valid java name and contains not printable characters */
        public static Node m5183(Object obj) {
            if (C0069.m5781() < 0) {
                return ((Node) obj).next;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۥۤۨۤ, reason: not valid java name and contains not printable characters */
        public static void m5184(Object obj, Object obj2, boolean z) {
            if (C0026.m2298() <= 0) {
                ((LinkedTreeMap) obj).removeInternal((Node) obj2, z);
            }
        }

        /* JADX INFO: renamed from: ۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
        public static int m5185(Object obj) {
            if (C0025.m2132() > 0) {
                return ((LinkedTreeMapIterator) obj).expectedModCount;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۣۡ۠ۧ, reason: not valid java name and contains not printable characters */
        public static Node m5186(Object obj) {
            if (C0029.m2791() >= 0) {
                return ((LinkedTreeMapIterator) obj).lastReturned;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۤۦۨ, reason: not valid java name and contains not printable characters */
        public static int m5187(Object obj) {
            if (C0036.m3653() <= 0) {
                return ((LinkedTreeMap) obj).modCount;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۥۦۤ۠, reason: contains not printable characters */
        public static Node m5188(Object obj) {
            if (C0039.m4109() >= 0) {
                return ((LinkedTreeMapIterator) obj).next;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۨۢۦ, reason: not valid java name and contains not printable characters */
        public static LinkedTreeMap m5189(Object obj) {
            if (C0075.m6893() > 0) {
                return LinkedTreeMap.this;
            }
            return null;
        }

        public LinkedTreeMapIterator() {
            this.next = m5183(m5182(LinkedTreeMap.this));
            this.expectedModCount = m5187(LinkedTreeMap.this);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return m5188(this) != m5182(m5189(this));
        }

        public final Node<K, V> nextNode() {
            Node<K, V> nodeM5188 = m5188(this);
            LinkedTreeMap linkedTreeMapM5189 = m5189(this);
            if (nodeM5188 == m5182(linkedTreeMapM5189)) {
                throw new NoSuchElementException();
            }
            if (m5187(linkedTreeMapM5189) != m5185(this)) {
                throw new ConcurrentModificationException();
            }
            this.next = m5183(nodeM5188);
            this.lastReturned = nodeM5188;
            return nodeM5188;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node nodeM5186 = m5186(this);
            if (nodeM5186 == null) {
                throw new IllegalStateException();
            }
            m5184(m5189(this), nodeM5186, true);
            this.lastReturned = null;
            this.expectedModCount = m5187(m5189(this));
        }
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f176short = {2545};
        int height;
        final K key;
        Node<K, V> left;
        Node<K, V> next;
        Node<K, V> parent;
        Node<K, V> prev;
        Node<K, V> right;
        V value;

        public Node() {
            this.key = null;
            this.prev = this;
            this.next = this;
        }

        /* JADX INFO: renamed from: ۟ۥۦۧۡ, reason: not valid java name and contains not printable characters */
        public static Node m5190(Object obj) {
            if (C0028.m2593() >= 0) {
                return ((Node) obj).left;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۧ۠ۥۦ, reason: not valid java name and contains not printable characters */
        public static Object m5191(Object obj) {
            if (C0021.m1598() <= 0) {
                return ((Node) obj).value;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۤ۟ۦۧ, reason: not valid java name and contains not printable characters */
        public static Node m5192(Object obj) {
            if (C0024.m2011() <= 0) {
                return ((Node) obj).right;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۧۥۦۡ, reason: not valid java name and contains not printable characters */
        public static short[] m5193() {
            if (C0076.m6903() < 0) {
                return f176short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۨۧۤۦ, reason: not valid java name and contains not printable characters */
        public static Object m5194(Object obj) {
            if (C0073.m6356() <= 0) {
                return ((Node) obj).key;
            }
            return null;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object objM5194 = m5194(this);
            if (objM5194 == null) {
                if (C0063.m4368(entry) != null) {
                    return false;
                }
            } else if (!C0023.m1865(objM5194, C0063.m4368(entry))) {
                return false;
            }
            Object objM5191 = m5191(this);
            if (objM5191 == null) {
                if (C0019.m1293(entry) != null) {
                    return false;
                }
            } else if (!C0023.m1865(objM5191, C0019.m1293(entry))) {
                return false;
            }
            return true;
        }

        public Node<K, V> first() {
            Node<K, V> node = this;
            for (Node<K, V> nodeM5190 = m5190(this); nodeM5190 != null; nodeM5190 = m5190(nodeM5190)) {
                node = nodeM5190;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) m5194(this);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) m5191(this);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object objM5194 = m5194(this);
            int iM3818 = objM5194 == null ? 0 : C0037.m3818(objM5194);
            Object objM5191 = m5191(this);
            return iM3818 ^ (objM5191 != null ? C0037.m3818(objM5191) : 0);
        }

        public Node<K, V> last() {
            Node<K, V> node = this;
            for (Node<K, V> nodeM5192 = m5192(this); nodeM5192 != null; nodeM5192 = m5192(nodeM5192)) {
                node = nodeM5192;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) m5191(this);
            this.value = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            C0036.m3741(sb, m5194(this));
            C0077.m7290(sb, C0024.m1945(m5193(), 0, 1, 2508));
            C0036.m3741(sb, m5191(this));
            return C0068.m5536(sb);
        }

        public Node(Node<K, V> node, K k, Node<K, V> node2, Node<K, V> node3) {
            this.parent = node;
            this.key = k;
            this.height = 1;
            this.next = node2;
            this.prev = node3;
            node3.next = this;
            node2.prev = this;
        }
    }

    public LinkedTreeMap() {
        this(m5166());
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static Comparator m5140(Object obj) {
        if (C0032.m3184() < 0) {
            return ((LinkedTreeMap) obj).comparator;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m5141(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((Node) obj).key;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static Node m5142(Object obj, Object obj2, boolean z) {
        if (C0071.m6069() >= 0) {
            return ((LinkedTreeMap) obj).find(obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static Node m5143(Object obj) {
        if (C0025.m2132() >= 0) {
            return ((Node) obj).next;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۤ, reason: not valid java name and contains not printable characters */
    public static Object m5144(Object obj) {
        if (C0073.m6356() < 0) {
            return ((Node) obj).value;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m5145(Object obj, Object obj2) {
        if (C0021.m1598() <= 0) {
            ((LinkedTreeMap) obj).rotateLeft((Node) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static Node m5146(Object obj) {
        if (C0031.m3075() >= 0) {
            return ((Node) obj).left;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static Node m5147(Object obj) {
        if (C0031.m3075() > 0) {
            return ((Node) obj).first();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m5148(Object obj, Object obj2) {
        if (C0034.m3450() >= 0) {
            ((LinkedTreeMap) obj).rotateRight((Node) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static Node m5149(Object obj, Object obj2) {
        if (C0016.m717() <= 0) {
            return ((LinkedTreeMap) obj).removeInternalByKey(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static Node m5150(Object obj) {
        if (C0036.m3653() <= 0) {
            return ((Node) obj).prev;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۨۢ, reason: not valid java name and contains not printable characters */
    public static KeySet m5151(Object obj) {
        if (C0072.m6216() >= 0) {
            return ((LinkedTreeMap) obj).keySet;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۢ, reason: not valid java name and contains not printable characters */
    public static Node m5152(Object obj) {
        if (C0070.m5903() > 0) {
            return ((Node) obj).parent;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static Node m5153(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((LinkedTreeMap) obj).header;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static Node m5154(Object obj) {
        if (C0071.m6069() > 0) {
            return ((Node) obj).last();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۢۦ, reason: not valid java name and contains not printable characters */
    public static EntrySet m5155(Object obj) {
        if (C0017.m846() > 0) {
            return ((LinkedTreeMap) obj).entrySet;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۠۠, reason: not valid java name and contains not printable characters */
    public static Node m5156(Object obj) {
        if (C0039.m4109() > 0) {
            return ((Node) obj).right;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۨۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5157() {
        if (C0066.m4827() >= 0) {
            return f175short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m5158(Object obj, Object obj2, boolean z) {
        if (C0020.m1385() < 0) {
            ((LinkedTreeMap) obj).rebalance((Node) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static int m5159(Object obj) {
        if (C0074.m6454() < 0) {
            return ((Node) obj).height;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static Node m5160(Object obj, Object obj2) {
        if (C0023.m1921() > 0) {
            return ((LinkedTreeMap) obj).findByObject(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static Node m5161(Object obj) {
        if (C0030.m2940() > 0) {
            return ((LinkedTreeMap) obj).root;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static int m5162(Object obj) {
        if (C0026.m2298() <= 0) {
            return ((LinkedTreeMap) obj).size;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۡۡ, reason: contains not printable characters */
    public static boolean m5163(Object obj, Object obj2, Object obj3) {
        if (C0073.m6356() < 0) {
            return ((LinkedTreeMap) obj).equal(obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۡۡ, reason: not valid java name and contains not printable characters */
    public static void m5164(Object obj, Object obj2, boolean z) {
        if (C0019.m1311() <= 0) {
            ((LinkedTreeMap) obj).removeInternal((Node) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۧۤۡ۟, reason: not valid java name and contains not printable characters */
    public static void m5165(Object obj, Object obj2, Object obj3) {
        if (C0111.m13165() < 0) {
            ((LinkedTreeMap) obj).replaceInParent((Node) obj2, (Node) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Comparator m5166() {
        if (C0033.m3358() <= 0) {
            return NATURAL_ORDER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۢۧ, reason: not valid java name and contains not printable characters */
    public static int m5167(Object obj) {
        if (C0033.m3358() < 0) {
            return ((LinkedTreeMap) obj).modCount;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount = m5167(this) + 1;
        Node<K, V> nodeM5153 = m5153(this);
        nodeM5153.prev = nodeM5153;
        nodeM5153.next = nodeM5153;
    }

    public Node<K, V> findByObject(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return m5142(this, obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
        Comparator<? super K> comparator2 = comparator;
        this.size = 0;
        this.modCount = 0;
        this.header = new Node<>();
        this.comparator = comparator2 == null ? m5166() : comparator2;
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && C0023.m1865(obj, obj2));
    }

    private void rebalance(Node<K, V> node, boolean z) {
        for (Node<K, V> nodeM5152 = node; nodeM5152 != null; nodeM5152 = m5152(nodeM5152)) {
            Node nodeM5146 = m5146(nodeM5152);
            Node nodeM5156 = m5156(nodeM5152);
            int iM5159 = nodeM5146 != null ? m5159(nodeM5146) : 0;
            int iM51592 = nodeM5156 != null ? m5159(nodeM5156) : 0;
            int i = iM5159 - iM51592;
            if (i == -2) {
                Node nodeM51462 = m5146(nodeM5156);
                Node nodeM51562 = m5156(nodeM5156);
                int iM51593 = (nodeM51462 != null ? m5159(nodeM51462) : 0) - (nodeM51562 != null ? m5159(nodeM51562) : 0);
                if (iM51593 == -1 || (iM51593 == 0 && !z)) {
                    m5145(this, nodeM5152);
                } else {
                    m5148(this, nodeM5156);
                    m5145(this, nodeM5152);
                }
                if (z) {
                    return;
                }
            } else if (i == 2) {
                Node nodeM51463 = m5146(nodeM5146);
                Node nodeM51563 = m5156(nodeM5146);
                int iM51594 = (nodeM51463 != null ? m5159(nodeM51463) : 0) - (nodeM51563 != null ? m5159(nodeM51563) : 0);
                if (iM51594 == 1 || (iM51594 == 0 && !z)) {
                    m5148(this, nodeM5152);
                } else {
                    m5145(this, nodeM5146);
                    m5148(this, nodeM5152);
                }
                if (z) {
                    return;
                }
            } else if (i == 0) {
                nodeM5152.height = iM5159 + 1;
                if (z) {
                    return;
                }
            } else {
                nodeM5152.height = C0074.m6445(iM5159, iM51592) + 1;
                if (!z) {
                    return;
                }
            }
        }
    }

    private void replaceInParent(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> nodeM5152 = m5152(node);
        node.parent = null;
        if (node2 != null) {
            node2.parent = nodeM5152;
        }
        if (nodeM5152 == null) {
            this.root = node2;
        } else if (m5146(nodeM5152) == node) {
            nodeM5152.left = node2;
        } else {
            nodeM5152.right = node2;
        }
    }

    private void rotateLeft(Node<K, V> node) {
        Node nodeM5146 = m5146(node);
        Node<K, V> nodeM5156 = m5156(node);
        Node<K, V> nodeM51462 = m5146(nodeM5156);
        Node nodeM51562 = m5156(nodeM5156);
        node.right = nodeM51462;
        if (nodeM51462 != null) {
            nodeM51462.parent = node;
        }
        m5165(this, node, nodeM5156);
        nodeM5156.left = node;
        node.parent = nodeM5156;
        int iM6445 = C0074.m6445(nodeM5146 != null ? m5159(nodeM5146) : 0, nodeM51462 != null ? m5159(nodeM51462) : 0) + 1;
        node.height = iM6445;
        nodeM5156.height = C0074.m6445(iM6445, nodeM51562 != null ? m5159(nodeM51562) : 0) + 1;
    }

    private void rotateRight(Node<K, V> node) {
        Node<K, V> nodeM5146 = m5146(node);
        Node nodeM5156 = m5156(node);
        Node nodeM51462 = m5146(nodeM5146);
        Node<K, V> nodeM51562 = m5156(nodeM5146);
        node.left = nodeM51562;
        if (nodeM51562 != null) {
            nodeM51562.parent = node;
        }
        m5165(this, node, nodeM5146);
        nodeM5146.right = node;
        node.parent = nodeM5146;
        int iM6445 = C0074.m6445(nodeM5156 != null ? m5159(nodeM5156) : 0, nodeM51562 != null ? m5159(nodeM51562) : 0) + 1;
        node.height = iM6445;
        nodeM5146.height = C0074.m6445(iM6445, nodeM51462 != null ? m5159(nodeM51462) : 0) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        EntrySet entrySetM5155 = m5155(this);
        if (entrySetM5155 != null) {
            return entrySetM5155;
        }
        LinkedTreeMap<K, V>.EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public Node<K, V> find(K k, boolean z) {
        int iM1768;
        Node<K, V> node;
        Comparator comparatorM5140 = m5140(this);
        Node<K, V> nodeM5161 = m5161(this);
        if (nodeM5161 != null) {
            Comparable comparable = comparatorM5140 == m5166() ? (Comparable) k : null;
            while (true) {
                iM1768 = comparable != null ? C0022.m1768(comparable, m5141(nodeM5161)) : C0034.m3419(comparatorM5140, k, m5141(nodeM5161));
                if (iM1768 == 0) {
                    return nodeM5161;
                }
                Node<K, V> nodeM5146 = iM1768 < 0 ? m5146(nodeM5161) : m5156(nodeM5161);
                if (nodeM5146 == null) {
                    break;
                }
                nodeM5161 = nodeM5146;
            }
        } else {
            iM1768 = 0;
        }
        if (!z) {
            return null;
        }
        Node nodeM5153 = m5153(this);
        if (nodeM5161 != null) {
            node = new Node<>(nodeM5161, k, nodeM5153, m5150(nodeM5153));
            if (iM1768 < 0) {
                nodeM5161.left = node;
            } else {
                nodeM5161.right = node;
            }
            m5158(this, nodeM5161, true);
        } else {
            if (comparatorM5140 == m5166() && !(k instanceof Comparable)) {
                throw new ClassCastException(C0032.m3232(C0038.m3997(C0030.m2951(k)), C0063.m4315(m5157(), 0, 18, 3105)));
            }
            node = new Node<>(nodeM5161, k, nodeM5153, m5150(nodeM5153));
            this.root = node;
        }
        this.size = m5162(this) + 1;
        this.modCount = m5167(this) + 1;
        return node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        KeySet keySetM5151 = m5151(this);
        if (keySetM5151 != null) {
            return keySetM5151;
        }
        LinkedTreeMap<K, V>.KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException(C0070.m5942(m5157(), 18, 11, 2871));
        }
        Node nodeM5142 = m5142(this, k, true);
        V v2 = (V) m5144(nodeM5142);
        nodeM5142.value = v;
        return v2;
    }

    public void removeInternal(Node<K, V> node, boolean z) {
        int iM5159;
        if (z) {
            Node<K, V> nodeM5150 = m5150(node);
            nodeM5150.next = m5143(node);
            m5143(node).prev = nodeM5150;
        }
        Node nodeM5146 = m5146(node);
        Node nodeM5156 = m5156(node);
        Node nodeM5152 = m5152(node);
        int iM51592 = 0;
        if (nodeM5146 == null || nodeM5156 == null) {
            if (nodeM5146 != null) {
                m5165(this, node, nodeM5146);
                node.left = null;
            } else if (nodeM5156 != null) {
                m5165(this, node, nodeM5156);
                node.right = null;
            } else {
                m5165(this, node, null);
            }
            m5158(this, nodeM5152, false);
            this.size = m5162(this) - 1;
            this.modCount = m5167(this) + 1;
            return;
        }
        Node<K, V> nodeM5154 = m5159(nodeM5146) > m5159(nodeM5156) ? m5154(nodeM5146) : m5147(nodeM5156);
        m5164(this, nodeM5154, false);
        Node<K, V> nodeM51462 = m5146(node);
        if (nodeM51462 != null) {
            iM5159 = m5159(nodeM51462);
            nodeM5154.left = nodeM51462;
            nodeM51462.parent = nodeM5154;
            node.left = null;
        } else {
            iM5159 = 0;
        }
        Node<K, V> nodeM51562 = m5156(node);
        if (nodeM51562 != null) {
            iM51592 = m5159(nodeM51562);
            nodeM5154.right = nodeM51562;
            nodeM51562.parent = nodeM5154;
            node.right = null;
        }
        nodeM5154.height = C0074.m6445(iM5159, iM51592) + 1;
        m5165(this, node, nodeM5154);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return m5162(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (m5160(this, obj) != null) {
            return true;
        }
        return false;
    }

    public Node<K, V> findByEntry(Map.Entry<?, ?> entry) {
        Node<K, V> nodeM5160 = m5160(this, C0063.m4368(entry));
        if (nodeM5160 == null || !m5163(this, m5144(nodeM5160), C0019.m1293(entry))) {
            return null;
        }
        return nodeM5160;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node nodeM5160 = m5160(this, obj);
        if (nodeM5160 != null) {
            return (V) m5144(nodeM5160);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node nodeM5149 = m5149(this, obj);
        if (nodeM5149 != null) {
            return (V) m5144(nodeM5149);
        }
        return null;
    }

    public Node<K, V> removeInternalByKey(Object obj) {
        Node<K, V> nodeM5160 = m5160(this, obj);
        if (nodeM5160 != null) {
            m5164(this, nodeM5160, true);
        }
        return nodeM5160;
    }
}
