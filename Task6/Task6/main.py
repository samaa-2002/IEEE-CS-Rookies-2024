
class Solution:
    def sampleStats( count):
        arr = []
        for i, c in enumerate(count):
            arr.extend([i] * c)

        def find_min(arr):

            minimum = arr[0]
            for num in arr:
                if num < minimum:
                    minimum = num
            return float(minimum)

        def find_max(arr):
            maximam = arr[0]
            for num in arr:
                if num > maximam:
                    maximam = num
            return float(maximam)

        def find_mean(arr):
            sum = 0
            length = 0
            for num in arr:
                sum += num
                length += 1
            mean = sum / length
            return float(mean)

        def find_mode(arr):
            num_counts = {}
            for num in arr:
                num_counts[num] = num_counts.get(num, 0) + 1

            max_count = max(num_counts.values())

            mode = None
            for num, count in num_counts.items():
                if count == max_count:
                    mode = num
                    break

            if len(num_counts) == 1:
                return float(mode)
            elif max_count == 1:
                return None
            else:
                return float(mode)

        def find_median(arr):
            length = len(arr)
            arr.sort()
            if length % 2 == 0:
                return (arr[int((length / 2)) - 1] + arr[int(length / 2)]) / 2
            else:
                return arr[int(length / 2)]

        lst = []
        lst.append(find_min(arr))
        lst.append(find_max(arr))
        lst.append(find_mean(arr))
        lst.append(find_median(arr))
        lst.append(find_mode(arr))
        return lst


    count=[0,4,3,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
    print(sampleStats(count))