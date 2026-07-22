package com.joke.plugin.gson.internal;

import com.android.apksig.C0037;
import com.android.apksig.C0038;
import com.android.apksig.C0039;
import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.C0020;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.joke.script.bean.C0074;
import com.zfork.entry.C0075;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
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
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.EntrySet entrySet;
    final Node<K, V> header;
    private LinkedHashTreeMap<K, V>.KeySet keySet;
    int modCount;
    int size;
    Node<K, V>[] table;
    int threshold;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f173short = {1437, 1492, 1486, 1437, 1491, 1490, 1481, 1437, 1534, 1490, 1488, 1485, 1500, 1487, 1500, 1503, 1489, 1496, 917, 923, 903, 990, 963, 963, 990, 912, 907, 914, 914};
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() { // from class: com.joke.plugin.gson.internal.LinkedHashTreeMap.1
        /* JADX INFO: renamed from: ۟ۡۨۨۥ, reason: not valid java name and contains not printable characters */
        public static int m5103(Object obj, Object obj2, Object obj3) {
            if (C0032.m3184() <= 0) {
                return ((AnonymousClass1) obj).compare2((Comparable) obj2, (Comparable) obj3);
            }
            return 0;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return m5103(this, comparable, comparable2);
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Comparable comparable, Comparable comparable2) {
            return C0022.m1768(comparable, comparable2);
        }
    };

    public static final class AvlBuilder<K, V> {
        private int leavesSkipped;
        private int leavesToSkip;
        private int size;
        private Node<K, V> stack;

        /* JADX INFO: renamed from: ۟۟ۧۡۡ, reason: not valid java name and contains not printable characters */
        public static Node m5104(Object obj) {
            if (C0025.m2132() >= 0) {
                return ((AvlBuilder) obj).stack;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۤۥۣۨ, reason: not valid java name and contains not printable characters */
        public static Node m5105(Object obj) {
            if (C0073.m6356() <= 0) {
                return ((Node) obj).parent;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۥۣۤ۠, reason: not valid java name and contains not printable characters */
        public static int m5106(Object obj) {
            if (C0063.m4427() > 0) {
                return ((AvlBuilder) obj).size;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۠ۧۨۢ, reason: not valid java name and contains not printable characters */
        public static int m5107(Object obj) {
            if (C0065.m4647() >= 0) {
                return ((AvlBuilder) obj).leavesSkipped;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۨۡ۠۟, reason: not valid java name and contains not printable characters */
        public static int m5108(Object obj) {
            if (C0063.m4427() > 0) {
                return ((AvlBuilder) obj).leavesToSkip;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۨۤۧۤ, reason: not valid java name and contains not printable characters */
        public static int m5109(Object obj) {
            if (C0066.m4827() > 0) {
                return ((Node) obj).height;
            }
            return 0;
        }

        public void add(Node<K, V> node) {
            node.right = null;
            node.parent = null;
            node.left = null;
            node.height = 1;
            int iM5108 = m5108(this);
            if (iM5108 > 0) {
                int iM5106 = m5106(this);
                if ((iM5106 & 1) == 0) {
                    this.size = iM5106 + 1;
                    this.leavesToSkip = iM5108 - 1;
                    this.leavesSkipped = m5107(this) + 1;
                }
            }
            node.parent = m5104(this);
            this.stack = node;
            int iM51062 = m5106(this);
            int i = iM51062 + 1;
            this.size = i;
            int iM51082 = m5108(this);
            if (iM51082 > 0 && (i & 1) == 0) {
                this.size = iM51062 + 2;
                this.leavesToSkip = iM51082 - 1;
                this.leavesSkipped = m5107(this) + 1;
            }
            int i2 = 4;
            while (true) {
                int i3 = i2 - 1;
                if ((m5106(this) & i3) != i3) {
                    return;
                }
                int iM5107 = m5107(this);
                if (iM5107 == 0) {
                    Node<K, V> nodeM5104 = m5104(this);
                    Node<K, V> nodeM5105 = m5105(nodeM5104);
                    Node<K, V> nodeM51052 = m5105(nodeM5105);
                    nodeM5105.parent = m5105(nodeM51052);
                    this.stack = nodeM5105;
                    nodeM5105.left = nodeM51052;
                    nodeM5105.right = nodeM5104;
                    nodeM5105.height = m5109(nodeM5104) + 1;
                    nodeM51052.parent = nodeM5105;
                    nodeM5104.parent = nodeM5105;
                } else if (iM5107 == 1) {
                    Node<K, V> nodeM51042 = m5104(this);
                    Node<K, V> nodeM51053 = m5105(nodeM51042);
                    this.stack = nodeM51053;
                    nodeM51053.right = nodeM51042;
                    nodeM51053.height = m5109(nodeM51042) + 1;
                    nodeM51042.parent = nodeM51053;
                    this.leavesSkipped = 0;
                } else if (iM5107 == 2) {
                    this.leavesSkipped = 0;
                }
                i2 *= 2;
            }
        }

        public Node<K, V> root() {
            Node<K, V> nodeM5104 = m5104(this);
            if (m5105(nodeM5104) == null) {
                return nodeM5104;
            }
            throw new IllegalStateException();
        }

        public void reset(int i) {
            this.leavesToSkip = ((C0068.m5647(i) * 2) - 1) - i;
            this.size = 0;
            this.leavesSkipped = 0;
            this.stack = null;
        }
    }

    public static class AvlIterator<K, V> {
        private Node<K, V> stackTop;

        /* JADX INFO: renamed from: ۣ۟ۢۨ۟, reason: not valid java name and contains not printable characters */
        public static Node m5110(Object obj) {
            if (C0073.m6356() <= 0) {
                return ((Node) obj).parent;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
        public static Node m5111(Object obj) {
            if (C0027.m2460() >= 0) {
                return ((Node) obj).right;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۢۡ۟ۥ, reason: not valid java name and contains not printable characters */
        public static Node m5112(Object obj) {
            if (C0016.m717() <= 0) {
                return ((Node) obj).left;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
        public static Node m5113(Object obj) {
            if (C0019.m1311() == 0) {
                return ((AvlIterator) obj).stackTop;
            }
            return null;
        }

        public void reset(Node<K, V> node) {
            Node<K, V> node2 = null;
            for (Node<K, V> nodeM5112 = node; nodeM5112 != null; nodeM5112 = m5112(nodeM5112)) {
                nodeM5112.parent = node2;
                node2 = nodeM5112;
            }
            this.stackTop = node2;
        }

        public Node<K, V> next() {
            Node<K, V> nodeM5113 = m5113(this);
            if (nodeM5113 == null) {
                return null;
            }
            Node<K, V> nodeM5110 = m5110(nodeM5113);
            nodeM5113.parent = null;
            Node<K, V> nodeM5111 = m5111(nodeM5113);
            while (true) {
                Node<K, V> node = nodeM5110;
                nodeM5110 = nodeM5111;
                if (nodeM5110 == null) {
                    this.stackTop = node;
                    return nodeM5113;
                }
                nodeM5110.parent = node;
                nodeM5111 = m5112(nodeM5110);
            }
        }
    }

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        /* JADX INFO: renamed from: ۟ۥۧۦۣ, reason: not valid java name and contains not printable characters */
        public static int m5114(Object obj) {
            if (C0023.m1921() > 0) {
                return ((LinkedHashTreeMap) obj).size;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۡۢۢۧ, reason: not valid java name and contains not printable characters */
        public static Node m5115(Object obj, Object obj2) {
            if (C0072.m6216() > 0) {
                return ((LinkedHashTreeMap) obj).findByEntry((Map.Entry) obj2);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦۦۢ۠, reason: contains not printable characters */
        public static LinkedHashTreeMap m5116(Object obj) {
            if (C0018.m1064() > 0) {
                return LinkedHashTreeMap.this;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦۧ۟ۢ, reason: contains not printable characters */
        public static void m5117(Object obj, Object obj2, boolean z) {
            if (C0034.m3450() > 0) {
                ((LinkedHashTreeMap) obj).removeInternal((Node) obj2, z);
            }
        }

        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0025.m2204(m5116(this));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && m5115(m5116(this), (Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() { // from class: com.joke.plugin.gson.internal.LinkedHashTreeMap.EntrySet.1
                /* JADX INFO: renamed from: ۠۠۠, reason: not valid java name and contains not printable characters */
                public static LinkedHashTreeMap m5118(Object obj) {
                    if (C0016.m717() < 0) {
                        return LinkedHashTreeMap.this;
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
                public static Node m5119(Object obj) {
                    if (C0070.m5903() >= 0) {
                        return ((LinkedTreeMapIterator) obj).nextNode();
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۤۨۥۢ, reason: not valid java name and contains not printable characters */
                public static Map.Entry m5120(Object obj) {
                    if (C0077.m7272() <= 0) {
                        return ((AnonymousClass1) obj).next();
                    }
                    return null;
                }

                @Override // java.util.Iterator
                public /* bridge */ /* synthetic */ Object next() {
                    return m5120(this);
                }

                {
                    m5118(EntrySet.this);
                }

                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    return m5119(this);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Node nodeM5115;
            if (!(obj instanceof Map.Entry) || (nodeM5115 = m5115(m5116(this), (Map.Entry) obj)) == null) {
                return false;
            }
            m5117(m5116(this), nodeM5115, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m5114(m5116(this));
        }
    }

    public final class KeySet extends AbstractSet<K> {
        /* JADX INFO: renamed from: ۣ۟ۤۨۦ, reason: not valid java name and contains not printable characters */
        public static int m5121(Object obj) {
            if (C0078.m7450() >= 0) {
                return ((LinkedHashTreeMap) obj).size;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۣۤۨۡ, reason: not valid java name and contains not printable characters */
        public static Node m5122(Object obj, Object obj2) {
            if (C0073.m6356() <= 0) {
                return ((LinkedHashTreeMap) obj).removeInternalByKey(obj2);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦۢ۟ۦ, reason: contains not printable characters */
        public static LinkedHashTreeMap m5123(Object obj) {
            if (C0016.m717() <= 0) {
                return LinkedHashTreeMap.this;
            }
            return null;
        }

        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0025.m2204(m5123(this));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C0077.m7293(m5123(this), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.joke.plugin.gson.internal.LinkedHashTreeMap.KeySet.1
                /* JADX INFO: renamed from: ۟۠ۡۤۧ, reason: not valid java name and contains not printable characters */
                public static LinkedHashTreeMap m5124(Object obj) {
                    if (C0039.m4109() > 0) {
                        return LinkedHashTreeMap.this;
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۡۧ۠ۨ, reason: not valid java name and contains not printable characters */
                public static Object m5125(Object obj) {
                    if (C0064.m4578() > 0) {
                        return ((Node) obj).key;
                    }
                    return null;
                }

                /* JADX INFO: renamed from: ۣۤۦۣ, reason: not valid java name and contains not printable characters */
                public static Node m5126(Object obj) {
                    if (C0065.m4647() >= 0) {
                        return ((LinkedTreeMapIterator) obj).nextNode();
                    }
                    return null;
                }

                {
                    m5124(KeySet.this);
                }

                @Override // java.util.Iterator
                public K next() {
                    return (K) m5125(m5126(this));
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return m5122(m5123(this), obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m5121(m5123(this));
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        int expectedModCount;
        Node<K, V> lastReturned = null;
        Node<K, V> next;

        /* JADX INFO: renamed from: ۣ۟۠ۧ۠, reason: not valid java name and contains not printable characters */
        public static Node m5127(Object obj) {
            if (C0111.m13165() <= 0) {
                return ((LinkedTreeMapIterator) obj).next;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۡۡۥ, reason: not valid java name and contains not printable characters */
        public static Node m5128(Object obj) {
            if (C0071.m6069() > 0) {
                return ((LinkedTreeMapIterator) obj).lastReturned;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۧ۠ۦ, reason: not valid java name and contains not printable characters */
        public static int m5129(Object obj) {
            if (C0077.m7272() < 0) {
                return ((LinkedTreeMapIterator) obj).expectedModCount;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۟ۦۢۦۡ, reason: not valid java name and contains not printable characters */
        public static Node m5130(Object obj) {
            if (C0019.m1311() >= 0) {
                return ((LinkedHashTreeMap) obj).header;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۠ۦۤۥ, reason: not valid java name and contains not printable characters */
        public static Node m5131(Object obj) {
            if (C0018.m1064() >= 0) {
                return ((Node) obj).next;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
        public static int m5132(Object obj) {
            if (C0035.m3569() < 0) {
                return ((LinkedHashTreeMap) obj).modCount;
            }
            return 0;
        }

        /* JADX INFO: renamed from: ۣۧۤۥ, reason: not valid java name and contains not printable characters */
        public static LinkedHashTreeMap m5133(Object obj) {
            if (C0036.m3653() <= 0) {
                return LinkedHashTreeMap.this;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥۦۣۨ, reason: contains not printable characters */
        public static void m5134(Object obj, Object obj2, boolean z) {
            if (C0030.m2940() >= 0) {
                ((LinkedHashTreeMap) obj).removeInternal((Node) obj2, z);
            }
        }

        public LinkedTreeMapIterator() {
            this.next = m5131(m5130(LinkedHashTreeMap.this));
            this.expectedModCount = m5132(LinkedHashTreeMap.this);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return m5127(this) != m5130(m5133(this));
        }

        public final Node<K, V> nextNode() {
            Node<K, V> nodeM5127 = m5127(this);
            LinkedHashTreeMap linkedHashTreeMapM5133 = m5133(this);
            if (nodeM5127 == m5130(linkedHashTreeMapM5133)) {
                throw new NoSuchElementException();
            }
            if (m5132(linkedHashTreeMapM5133) != m5129(this)) {
                throw new ConcurrentModificationException();
            }
            this.next = m5131(nodeM5127);
            this.lastReturned = nodeM5127;
            return nodeM5127;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node nodeM5128 = m5128(this);
            if (nodeM5128 == null) {
                throw new IllegalStateException();
            }
            m5134(m5133(this), nodeM5128, true);
            this.lastReturned = null;
            this.expectedModCount = m5132(m5133(this));
        }
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f174short = {2408};
        final int hash;
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
            this.hash = -1;
            this.prev = this;
            this.next = this;
        }

        /* JADX INFO: renamed from: ۟۠ۥۣۤ, reason: not valid java name and contains not printable characters */
        public static Node m5135(Object obj) {
            if (C0025.m2132() >= 0) {
                return ((Node) obj).left;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
        public static Object m5136(Object obj) {
            if (C0074.m6454() < 0) {
                return ((Node) obj).value;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۣ۟ۦۣۣ, reason: not valid java name and contains not printable characters */
        public static short[] m5137() {
            if (C0037.m3837() <= 0) {
                return f174short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۟ۧۡۢ۠, reason: not valid java name and contains not printable characters */
        public static Node m5138(Object obj) {
            if (C0078.m7450() >= 0) {
                return ((Node) obj).right;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۨۡۨۨ, reason: not valid java name and contains not printable characters */
        public static Object m5139(Object obj) {
            if (C0024.m2011() < 0) {
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
            Object objM5139 = m5139(this);
            if (objM5139 == null) {
                if (C0063.m4368(entry) != null) {
                    return false;
                }
            } else if (!C0023.m1865(objM5139, C0063.m4368(entry))) {
                return false;
            }
            Object objM5136 = m5136(this);
            if (objM5136 == null) {
                if (C0019.m1293(entry) != null) {
                    return false;
                }
            } else if (!C0023.m1865(objM5136, C0019.m1293(entry))) {
                return false;
            }
            return true;
        }

        public Node<K, V> first() {
            Node<K, V> node = this;
            for (Node<K, V> nodeM5135 = m5135(this); nodeM5135 != null; nodeM5135 = m5135(nodeM5135)) {
                node = nodeM5135;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) m5139(this);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) m5136(this);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object objM5139 = m5139(this);
            int iM3818 = objM5139 == null ? 0 : C0037.m3818(objM5139);
            Object objM5136 = m5136(this);
            return iM3818 ^ (objM5136 != null ? C0037.m3818(objM5136) : 0);
        }

        public Node<K, V> last() {
            Node<K, V> node = this;
            for (Node<K, V> nodeM5138 = m5138(this); nodeM5138 != null; nodeM5138 = m5138(nodeM5138)) {
                node = nodeM5138;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) m5136(this);
            this.value = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            C0036.m3741(sb, m5139(this));
            C0077.m7290(sb, C0077.m7205(m5137(), 0, 1, 2389));
            C0036.m3741(sb, m5136(this));
            return C0068.m5536(sb);
        }

        public Node(Node<K, V> node, K k, int i, Node<K, V> node2, Node<K, V> node3) {
            this.parent = node;
            this.key = k;
            this.hash = i;
            this.height = 1;
            this.next = node2;
            this.prev = node3;
            node3.next = this;
            node2.prev = this;
        }
    }

    public LinkedHashTreeMap() {
        this(m5092());
    }

    private void doubleCapacity() {
        Node<K, V>[] nodeArrM5074 = m5074(m5065(this));
        this.table = nodeArrM5074;
        this.threshold = (nodeArrM5074.length / 4) + (nodeArrM5074.length / 2);
    }

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static Node[] m5065(Object obj) {
        if (C0032.m3184() < 0) {
            return ((LinkedHashTreeMap) obj).table;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static int m5066(Object obj) {
        if (C0019.m1311() <= 0) {
            return ((LinkedHashTreeMap) obj).threshold;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static Node m5067(Object obj) {
        if (C0073.m6356() < 0) {
            return ((Node) obj).left;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m5068(Object obj) {
        if (C0033.m3358() <= 0) {
            return ((LinkedHashTreeMap) obj).size;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m5069(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((LinkedHashTreeMap) obj).modCount;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Node m5070(Object obj) {
        if (C0068.m5678() >= 0) {
            return ((Node) obj).parent;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static Node m5071(Object obj) {
        if (C0019.m1311() == 0) {
            return ((LinkedHashTreeMap) obj).header;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5072(Object obj, Object obj2, Object obj3) {
        if (C0038.m4010() >= 0) {
            return ((LinkedHashTreeMap) obj).equal(obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m5073(int i) {
        if (C0067.m5468() <= 0) {
            return secondaryHash(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۧ, reason: not valid java name and contains not printable characters */
    public static Node[] m5074(Object obj) {
        if (C0018.m1064() > 0) {
            return doubleCapacity((Node[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static Node m5075(Object obj, Object obj2) {
        if (C0021.m1598() < 0) {
            return ((LinkedHashTreeMap) obj).findByObject(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5076() {
        if (C0111.m13165() <= 0) {
            return f173short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static void m5077(Object obj, Object obj2, boolean z) {
        if (C0036.m3653() <= 0) {
            ((LinkedHashTreeMap) obj).rebalance((Node) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m5078(Object obj, Object obj2, boolean z) {
        if (C0029.m2791() > 0) {
            ((LinkedHashTreeMap) obj).removeInternal((Node) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۦ۟, reason: not valid java name and contains not printable characters */
    public static EntrySet m5079(Object obj) {
        if (C0068.m5678() > 0) {
            return ((LinkedHashTreeMap) obj).entrySet;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m5080(Object obj) {
        if (C0078.m7450() >= 0) {
            return ((Node) obj).key;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۦۢ, reason: not valid java name and contains not printable characters */
    public static Node m5081(Object obj) {
        if (C0036.m3653() < 0) {
            return ((Node) obj).last();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m5082(Object obj) {
        if (C0069.m5781() < 0) {
            return ((Node) obj).height;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۢ, reason: not valid java name and contains not printable characters */
    public static void m5083(Object obj, Object obj2) {
        if (C0063.m4427() > 0) {
            ((AvlBuilder) obj).add((Node) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۡۤ, reason: not valid java name and contains not printable characters */
    public static Node m5084(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((Node) obj).prev;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static Comparator m5085(Object obj) {
        if (C0038.m4010() >= 0) {
            return ((LinkedHashTreeMap) obj).comparator;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Node m5086(Object obj) {
        if (C0020.m1385() < 0) {
            return ((AvlIterator) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m5087(Object obj, Object obj2) {
        if (C0039.m4109() > 0) {
            ((AvlIterator) obj).reset((Node) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۡۡۡ, reason: not valid java name and contains not printable characters */
    public static Node m5088(Object obj) {
        if (C0078.m7450() > 0) {
            return ((AvlBuilder) obj).root();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧ۟, reason: not valid java name and contains not printable characters */
    public static KeySet m5089(Object obj) {
        if (C0020.m1385() < 0) {
            return ((LinkedHashTreeMap) obj).keySet;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۧ, reason: not valid java name and contains not printable characters */
    public static Node m5090(Object obj) {
        if (C0031.m3075() > 0) {
            return ((Node) obj).right;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static Node m5091(Object obj, Object obj2) {
        if (C0076.m6903() <= 0) {
            return ((LinkedHashTreeMap) obj).removeInternalByKey(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static Comparator m5092() {
        if (C0025.m2132() >= 0) {
            return NATURAL_ORDER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m5093(Object obj, Object obj2) {
        if (C0028.m2593() >= 0) {
            ((LinkedHashTreeMap) obj).rotateRight((Node) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static void m5094(Object obj) {
        if (C0074.m6454() <= 0) {
            ((LinkedHashTreeMap) obj).doubleCapacity();
        }
    }

    /* JADX INFO: renamed from: ۣۦۦ۠, reason: not valid java name and contains not printable characters */
    public static Node m5095(Object obj) {
        if (C0075.m6893() > 0) {
            return ((Node) obj).first();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ۟, reason: not valid java name and contains not printable characters */
    public static int m5096(Object obj) {
        if (C0029.m2791() >= 0) {
            return ((Node) obj).hash;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m5097(Object obj) {
        if (C0076.m6903() < 0) {
            return ((Node) obj).value;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۡۥ, reason: not valid java name and contains not printable characters */
    public static void m5098(Object obj, int i) {
        if (C0037.m3837() < 0) {
            ((AvlBuilder) obj).reset(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Node m5099(Object obj, Object obj2, boolean z) {
        if (C0028.m2593() > 0) {
            return ((LinkedHashTreeMap) obj).find(obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۧۨ, reason: contains not printable characters */
    public static Node m5100(Object obj) {
        if (C0017.m846() >= 0) {
            return ((Node) obj).next;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static void m5101(Object obj, Object obj2, Object obj3) {
        if (C0063.m4427() > 0) {
            ((LinkedHashTreeMap) obj).replaceInParent((Node) obj2, (Node) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۦۣۥ, reason: not valid java name and contains not printable characters */
    public static void m5102(Object obj, Object obj2) {
        if (C0039.m4109() >= 0) {
            ((LinkedHashTreeMap) obj).rotateLeft((Node) obj2);
        }
    }

    public Node<K, V> findByObject(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return m5099(this, obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public void removeInternal(Node<K, V> node, boolean z) {
        int iM5082;
        if (z) {
            Node<K, V> nodeM5084 = m5084(node);
            nodeM5084.next = m5100(node);
            m5100(node).prev = nodeM5084;
            node.prev = null;
            node.next = null;
        }
        Node nodeM5067 = m5067(node);
        Node nodeM5090 = m5090(node);
        Node nodeM5070 = m5070(node);
        int iM50822 = 0;
        if (nodeM5067 == null || nodeM5090 == null) {
            if (nodeM5067 != null) {
                m5101(this, node, nodeM5067);
                node.left = null;
            } else if (nodeM5090 != null) {
                m5101(this, node, nodeM5090);
                node.right = null;
            } else {
                m5101(this, node, null);
            }
            m5077(this, nodeM5070, false);
            this.size = m5068(this) - 1;
            this.modCount = m5069(this) + 1;
            return;
        }
        Node<K, V> nodeM5081 = m5082(nodeM5067) > m5082(nodeM5090) ? m5081(nodeM5067) : m5095(nodeM5090);
        m5078(this, nodeM5081, false);
        Node<K, V> nodeM50672 = m5067(node);
        if (nodeM50672 != null) {
            iM5082 = m5082(nodeM50672);
            nodeM5081.left = nodeM50672;
            nodeM50672.parent = nodeM5081;
            node.left = null;
        } else {
            iM5082 = 0;
        }
        Node<K, V> nodeM50902 = m5090(node);
        if (nodeM50902 != null) {
            iM50822 = m5082(nodeM50902);
            nodeM5081.right = nodeM50902;
            nodeM50902.parent = nodeM5081;
            node.right = null;
        }
        nodeM5081.height = C0074.m6445(iM5082, iM50822) + 1;
        m5101(this, node, nodeM5081);
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        Comparator<? super K> comparator2 = comparator;
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator2 == null ? m5092() : comparator2;
        this.header = new Node<>();
        Node<K, V>[] nodeArr = new Node[16];
        this.table = nodeArr;
        this.threshold = (nodeArr.length / 4) + (nodeArr.length / 2);
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && C0023.m1865(obj, obj2));
    }

    private void rebalance(Node<K, V> node, boolean z) {
        for (Node<K, V> nodeM5070 = node; nodeM5070 != null; nodeM5070 = m5070(nodeM5070)) {
            Node nodeM5067 = m5067(nodeM5070);
            Node nodeM5090 = m5090(nodeM5070);
            int iM5082 = nodeM5067 != null ? m5082(nodeM5067) : 0;
            int iM50822 = nodeM5090 != null ? m5082(nodeM5090) : 0;
            int i = iM5082 - iM50822;
            if (i == -2) {
                Node nodeM50672 = m5067(nodeM5090);
                Node nodeM50902 = m5090(nodeM5090);
                int iM50823 = (nodeM50672 != null ? m5082(nodeM50672) : 0) - (nodeM50902 != null ? m5082(nodeM50902) : 0);
                if (iM50823 == -1 || (iM50823 == 0 && !z)) {
                    m5102(this, nodeM5070);
                } else {
                    m5093(this, nodeM5090);
                    m5102(this, nodeM5070);
                }
                if (z) {
                    return;
                }
            } else if (i == 2) {
                Node nodeM50673 = m5067(nodeM5067);
                Node nodeM50903 = m5090(nodeM5067);
                int iM50824 = (nodeM50673 != null ? m5082(nodeM50673) : 0) - (nodeM50903 != null ? m5082(nodeM50903) : 0);
                if (iM50824 == 1 || (iM50824 == 0 && !z)) {
                    m5093(this, nodeM5070);
                } else {
                    m5102(this, nodeM5067);
                    m5093(this, nodeM5070);
                }
                if (z) {
                    return;
                }
            } else if (i == 0) {
                nodeM5070.height = iM5082 + 1;
                if (z) {
                    return;
                }
            } else {
                nodeM5070.height = C0074.m6445(iM5082, iM50822) + 1;
                if (!z) {
                    return;
                }
            }
        }
    }

    private void replaceInParent(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> nodeM5070 = m5070(node);
        node.parent = null;
        if (node2 != null) {
            node2.parent = nodeM5070;
        }
        if (nodeM5070 == null) {
            int iM5096 = m5096(node);
            m5065(this)[iM5096 & (r0.length - 1)] = node2;
        } else if (m5067(nodeM5070) == node) {
            nodeM5070.left = node2;
        } else {
            nodeM5070.right = node2;
        }
    }

    private void rotateLeft(Node<K, V> node) {
        Node nodeM5067 = m5067(node);
        Node<K, V> nodeM5090 = m5090(node);
        Node<K, V> nodeM50672 = m5067(nodeM5090);
        Node nodeM50902 = m5090(nodeM5090);
        node.right = nodeM50672;
        if (nodeM50672 != null) {
            nodeM50672.parent = node;
        }
        m5101(this, node, nodeM5090);
        nodeM5090.left = node;
        node.parent = nodeM5090;
        int iM6445 = C0074.m6445(nodeM5067 != null ? m5082(nodeM5067) : 0, nodeM50672 != null ? m5082(nodeM50672) : 0) + 1;
        node.height = iM6445;
        nodeM5090.height = C0074.m6445(iM6445, nodeM50902 != null ? m5082(nodeM50902) : 0) + 1;
    }

    private void rotateRight(Node<K, V> node) {
        Node<K, V> nodeM5067 = m5067(node);
        Node nodeM5090 = m5090(node);
        Node nodeM50672 = m5067(nodeM5067);
        Node<K, V> nodeM50902 = m5090(nodeM5067);
        node.left = nodeM50902;
        if (nodeM50902 != null) {
            nodeM50902.parent = node;
        }
        m5101(this, node, nodeM5067);
        nodeM5067.right = node;
        node.parent = nodeM5067;
        int iM6445 = C0074.m6445(nodeM5090 != null ? m5082(nodeM5090) : 0, nodeM50902 != null ? m5082(nodeM50902) : 0) + 1;
        node.height = iM6445;
        nodeM5067.height = C0074.m6445(iM6445, nodeM50672 != null ? m5082(nodeM50672) : 0) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        C0070.m5958(m5065(this), null);
        this.size = 0;
        this.modCount = m5069(this) + 1;
        Node<K, V> nodeM5071 = m5071(this);
        Node<K, V> nodeM5100 = m5100(nodeM5071);
        while (nodeM5100 != nodeM5071) {
            Node<K, V> nodeM51002 = m5100(nodeM5100);
            nodeM5100.prev = null;
            nodeM5100.next = null;
            nodeM5100 = nodeM51002;
        }
        nodeM5071.prev = nodeM5071;
        nodeM5071.next = nodeM5071;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        EntrySet entrySetM5079 = m5079(this);
        if (entrySetM5079 != null) {
            return entrySetM5079;
        }
        LinkedHashTreeMap<K, V>.EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public Node<K, V> find(K k, boolean z) {
        Node<K, V> node;
        int i;
        Node<K, V> node2;
        Comparator comparatorM5085 = m5085(this);
        Node<K, V>[] nodeArrM5065 = m5065(this);
        int iM5073 = m5073(C0037.m3818(k));
        int length = (nodeArrM5065.length - 1) & iM5073;
        Node<K, V> node3 = nodeArrM5065[length];
        if (node3 != null) {
            Comparable comparable = comparatorM5085 == m5092() ? (Comparable) k : null;
            while (true) {
                int iM1768 = comparable != null ? C0022.m1768(comparable, m5080(node3)) : C0034.m3419(comparatorM5085, k, m5080(node3));
                if (iM1768 == 0) {
                    return node3;
                }
                Node<K, V> nodeM5067 = iM1768 < 0 ? m5067(node3) : m5090(node3);
                if (nodeM5067 == null) {
                    node = node3;
                    i = iM1768;
                    break;
                }
                node3 = nodeM5067;
            }
        } else {
            node = node3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        Node nodeM5071 = m5071(this);
        if (node != null) {
            node2 = new Node<>(node, k, iM5073, nodeM5071, m5084(nodeM5071));
            if (i < 0) {
                node.left = node2;
            } else {
                node.right = node2;
            }
            m5077(this, node, true);
        } else {
            if (comparatorM5085 == m5092() && !(k instanceof Comparable)) {
                throw new ClassCastException(C0032.m3232(C0038.m3997(C0030.m2951(k)), C0037.m3829(m5076(), 0, 18, 1469)));
            }
            node2 = new Node<>(node, k, iM5073, nodeM5071, m5084(nodeM5071));
            nodeArrM5065[length] = node2;
        }
        int iM5068 = m5068(this);
        this.size = iM5068 + 1;
        if (iM5068 > m5066(this)) {
            m5094(this);
        }
        this.modCount = m5069(this) + 1;
        return node2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        KeySet keySetM5089 = m5089(this);
        if (keySetM5089 != null) {
            return keySetM5089;
        }
        LinkedHashTreeMap<K, V>.KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException(C0024.m1945(m5076(), 18, 11, 1022));
        }
        Node nodeM5099 = m5099(this, k, true);
        V v2 = (V) m5097(nodeM5099);
        nodeM5099.value = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return m5068(this);
    }

    public static <K, V> Node<K, V>[] doubleCapacity(Node<K, V>[] nodeArr) {
        int length = nodeArr.length;
        Node<K, V>[] nodeArr2 = new Node[length * 2];
        AvlIterator avlIterator = new AvlIterator();
        AvlBuilder avlBuilder = new AvlBuilder();
        AvlBuilder avlBuilder2 = new AvlBuilder();
        for (int i = 0; i < length; i++) {
            Node<K, V> node = nodeArr[i];
            if (node != null) {
                m5087(avlIterator, node);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    Node nodeM5086 = m5086(avlIterator);
                    if (nodeM5086 == null) {
                        break;
                    }
                    if ((m5096(nodeM5086) & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                m5098(avlBuilder, i2);
                m5098(avlBuilder2, i3);
                m5087(avlIterator, node);
                while (true) {
                    Node nodeM50862 = m5086(avlIterator);
                    if (nodeM50862 == null) {
                        break;
                    }
                    if ((m5096(nodeM50862) & length) == 0) {
                        m5083(avlBuilder, nodeM50862);
                    } else {
                        m5083(avlBuilder2, nodeM50862);
                    }
                }
                nodeArr2[i] = i2 > 0 ? m5088(avlBuilder) : null;
                nodeArr2[i + length] = i3 > 0 ? m5088(avlBuilder2) : null;
            }
        }
        return nodeArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (m5075(this, obj) != null) {
            return true;
        }
        return false;
    }

    public Node<K, V> findByEntry(Map.Entry<?, ?> entry) {
        Node<K, V> nodeM5075 = m5075(this, C0063.m4368(entry));
        if (nodeM5075 == null || !m5072(this, m5097(nodeM5075), C0019.m1293(entry))) {
            return null;
        }
        return nodeM5075;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node nodeM5075 = m5075(this, obj);
        if (nodeM5075 != null) {
            return (V) m5097(nodeM5075);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node nodeM5091 = m5091(this, obj);
        if (nodeM5091 != null) {
            return (V) m5097(nodeM5091);
        }
        return null;
    }

    public Node<K, V> removeInternalByKey(Object obj) {
        Node<K, V> nodeM5075 = m5075(this, obj);
        if (nodeM5075 != null) {
            m5078(this, nodeM5075, true);
        }
        return nodeM5075;
    }
}
